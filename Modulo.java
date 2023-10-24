public class Modulo extends Calculator {
    
    private double numOne;
    private double numTwo;

    public Modulo(String calcName, double numOne, double numTwo) {
        super(calcName);

        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double moduloNumbers() {
        return numOne % numTwo;
    }
}
