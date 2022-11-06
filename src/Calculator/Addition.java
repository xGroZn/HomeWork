package Calculator;

public class Addition implements Calculator {
    @Override
    public void action(double firstValue, double secondValue) {
        double value = firstValue + secondValue;
        System.out.println("Результат сложения равен " + value);
    }
}
