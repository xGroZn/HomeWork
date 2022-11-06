package Calculator;

public class Division implements Calculator {
    @Override
    public void action(double firstValue, double secondValue) {
        double value = firstValue / secondValue;
        System.out.println("Результат деления равен " + value);
    }
}
