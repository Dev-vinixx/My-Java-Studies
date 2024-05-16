package completableFuture.exercises;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Basic {

    @NotNull
    public String returnsMessage( @NotNull String message) throws ExecutionException, InterruptedException {
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
}
