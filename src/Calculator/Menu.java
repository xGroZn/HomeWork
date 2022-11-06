package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private double firstValueOfNumbers;
    private double secondValueOfNumbers;
    public void mathOperation() {
        choosingProgram();
    }
    private void choosingProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение 1 или 2, где 1 - выход из программы, 2 - начать работу с калькулятором");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Good bye");
                break;
            case 2:
                inputFirstValueOfNumbers();
                inputSecondValueOfNumbers();
                inputMathOperationType();
                choosingProgram();
                break;
            default:
                System.out.println("Вы ввели неверное значение!");
                choosingProgram();
        }
    }
    private void inputFirstValueOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первого числа");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введенное значение должно быть числом.");
            inputFirstValueOfNumbers();
        } else {
            double firstValue = scanner.nextDouble();
            firstValueOfNumbers = firstValue;
        }
    }
    private void inputSecondValueOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение второго числа");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введенное значение должно быть числом.");
            inputSecondValueOfNumbers();
        } else {
            double secondValue = scanner.nextDouble();
            secondValueOfNumbers = secondValue;
        }
    }
    private void inputMathOperationType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип математической операции (сложение, вычитание, умножение или деление)");
        if (!scanner.hasNext("сложение") && !scanner.hasNext("вычитание") && !scanner.hasNext("умножение") && !scanner.hasNext("деление")) {
            System.out.println("Ошибка! Введите правильное название операции.");
            inputMathOperationType();
        } else {
            String mathOperationType = scanner.next();
            switch (mathOperationType) {
                case "сложение":
                    Addition addition = new Addition();
                    addition.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "вычитание":
                    Subtraction subtraction = new Subtraction();
                    subtraction.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "умножение":
                    Multiplication multiplication = new Multiplication();
                    multiplication.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
                case "деление":
                    Division division = new Division();
                    division.action(firstValueOfNumbers, secondValueOfNumbers);
                    break;
            }
        }
    }
}