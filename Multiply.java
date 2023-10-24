public class Multiply extends Calculator {

    private double numOne;
    private double numTwo;

    public Multiply(String calcName, double numOne, double numTwo) {
        super(calcName);

        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double multiplyNumbers() {
        return numOne * numTwo;
    }
}
