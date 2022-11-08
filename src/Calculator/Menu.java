package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private double firstValueOfNumbers;
    private double secondValueOfNumbers;
    private String firstValueText = "Введите значение первого числа";
    private String secondValueText = "Введите значение второго числа";
    Scanner scanner = new Scanner(System.in);
    public void mathOperation() {
        choosingProgram();
    }
    private void choosingProgram() {
        System.out.println("Введите значение 1 или 2, где 1 - выход из программы, 2 - начать работу с калькулятором");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Good bye");
                break;
            case 2:
                firstValueOfNumbers = inputValueOfNumbers(firstValueText);
                secondValueOfNumbers = inputValueOfNumbers(secondValueText);
                inputMathOperationType();
                choosingProgram();
                break;
            default:
                System.out.println("Вы ввели неверное значение!");
                choosingProgram();
        }
    }
    private double inputValueOfNumbers(String text) {
        System.out.println(text);
        double value = 0;
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введенное значение должно быть числом.");
            scanner.next();
            return inputValueOfNumbers(text);
        } else {
            return scanner.nextDouble();
        }
    }
    private void inputMathOperationType() {
        System.out.println("Введите тип математической операции (сложение, вычитание, умножение или деление)");
        if (!scanner.hasNext("сложение") && !scanner.hasNext("вычитание") && !scanner.hasNext("умножение") && !scanner.hasNext("деление")) {
            System.out.println("Ошибка! Введите правильное название операции.");
            scanner.next();
            inputMathOperationType();
        } else {
            String mathOperationType = scanner.next();
            double result = 0;
            switch (mathOperationType) {
                case "сложение":
                    Addition addition = new Addition();
                    result = addition.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "вычитание":
                    Subtraction subtraction = new Subtraction();
                    result = subtraction.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "умножение":
                    Multiplication multiplication = new Multiplication();
                    result = multiplication.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "деление":
                    Division division = new Division();
                    result = division.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
            }
            System.out.println("Результат выполнения матетматической операции равен " + result);
        }
    }
}