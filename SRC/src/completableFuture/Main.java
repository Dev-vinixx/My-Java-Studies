package completableFuture;

import completableFuture.exercises.Basic;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try {
            Basic exerciseBasic = new Basic();

            System.out.println(exerciseBasic.returnsMessage("Hello World!"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
