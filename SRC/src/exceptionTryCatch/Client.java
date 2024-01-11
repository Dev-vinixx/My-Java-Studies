package exceptionTryCatch;

public class Client {
    public static void main(String[] args) {
        double finalValue = 15000.00;
        double inputValue = 5000;
        int plots = 3;
        try {
            Financing newFinancing = new Financing(finalValue, inputValue, plots);
            System.out.println(newFinancing.installment());
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

}
