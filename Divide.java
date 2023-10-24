public class Divide extends Calculator {

    private double numOne;
    private double numTwo;

    public Divide(String calcName, double numOne, double numTwo) {
        super(calcName);

        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double divideNumbers() {
        return numOne / numTwo;
    }
}
