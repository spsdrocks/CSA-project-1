public class Subtract extends Calculator {

    private double numOne;
    private double numTwo;

    public Subtract(String calcName, double numOne, double numTwo) {
        super(calcName);

        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double subtractNumbers() {
        return numOne - numTwo;
    }
}
