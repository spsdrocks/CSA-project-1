public class Add extends Calculator {

    private double numOne;
    private double numTwo;

    public Add(String calcName, double numOne, double numTwo) {
        super(calcName);

        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double addNumbers() {
        return numOne + numTwo;
    }
}