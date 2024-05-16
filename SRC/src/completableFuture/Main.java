package completableFuture;

import completableFuture.exercises.Basic;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            Basic exerciseBasic = new Basic();

            List<String> results = exerciseBasic.insanePerformanceTest();
            for (String result : results) {
                System.out.println(result);
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
