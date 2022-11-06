package Calculator;

public class Multiplication implements Calculator {
    @Override
    public void action(double firstValue, double secondValue) {
        double value = firstValue * secondValue;
        System.out.println("Результат умножение равен " + value);
    }
}
