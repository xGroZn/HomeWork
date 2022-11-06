package Calculator;

public class Subtraction implements Calculator {
    @Override
    public void action(double firstValue, double secondValue) {
        double value = firstValue - secondValue;
        System.out.println("Результат вычитания равен " + value);
    }
}
