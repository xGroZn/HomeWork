package Calculator;

public class Addition implements Calculator {

    @Override
    public double action(double firstValue, double secondValue) {
        double value = firstValue + secondValue;
        return value;
    }
}