package completableFuture.exercises;

import org.jetbrains.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Basic {

    @NotNull
    public String returnsMessage( @NotNull String message ) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException("interruption during sleep", e);
            }
            return message;
        });

        return future.get();
    };

    @NotNull
    public String TransformingResults( @NotNull String message ) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException("interruption during sleep", e);
            }

            return message;
        });

        CompletableFuture<String> newFuture = future.thenApply(result -> "result is: " + result);

        return newFuture.get();
    }

    @NotNull
    public String combiningMultipleCompletableFuture( @NotNull String partOne, @NotNull String partTwo) throws ExecutionException, InterruptedException {

        CompletableFuture<String> futureOne = CompletableFuture.supplyAsync(() -> partOne);
        CompletableFuture<String> futureTwo = CompletableFuture.supplyAsync(() -> partTwo);

        CompletableFuture<String> jointFuture = futureOne.thenCombine(futureTwo, (resultOne, resultTwo) -> resultOne + " " + resultTwo);

        return jointFuture.get();
    }

    @NotNull
    public List<String> insanePerformanceTest() throws ExecutionException, InterruptedException {
        @NotNull String message = "Hello World";
        @NotNull String partOne = "Test";
        @NotNull String partTwo = "foda";

        List<CompletableFuture<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            futures.add(CompletableFuture.supplyAsync(() -> {
                try {
                    return this.returnsMessage(message);
                } catch (ExecutionException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));

            futures.add(CompletableFuture.supplyAsync(() -> {
                try {
                    return this.TransformingResults(message);
                } catch (ExecutionException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));

            futures.add(CompletableFuture.supplyAsync(() -> {
                try {
                    return this.combiningMultipleCompletableFuture(partOne, partTwo);
                } catch (ExecutionException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        return futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }

}