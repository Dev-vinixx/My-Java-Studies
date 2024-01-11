package exceptionTryCatch;

public class Financing {
    private double finalValue;
    private double inputValue;
    private int plots;
    public Financing(double finalValue, double inputValue, int plots){
        if (inputValue < finalValue * 0.2) {
            throw new RuntimeException("The down payment must be at least 20% of the total amount");
        } else if (plots < 6){
            throw new RuntimeException("The minimum installments are 6");
        }

        this.finalValue = finalValue;
        this.inputValue = inputValue;
        this.plots = plots;
    }
    public double installment() {
        return (finalValue - inputValue) / plots;
    }
}
