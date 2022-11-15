package Calculator;

public class Division implements Calculator {
    @Override
    public double action(double firstValue, double secondValue) {
        if (secondValue == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            return firstValue / secondValue;
        }
        return firstValue;
    }
}
