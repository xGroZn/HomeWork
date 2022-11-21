package Calculator;

import java.util.*;

public class Menu {

    private double firstValueOfNumbers;
    private double secondValueOfNumbers;
    private String firstValueText = "Введите значение первого числа";
    private String secondValueText = "Введите значение второго числа";
    private ResultOperationHistoryImpl history = new ResultOperationHistoryImpl();
    private ResultOperationHistoryCollectionImpl historyCollection = new ResultOperationHistoryCollectionImpl();
    private ResultOperationHistoryByHashMap historyByHashMap = new ResultOperationHistoryByHashMap();
    private LinkedList<Double> linkedListAddition = new LinkedList<>();
    private LinkedList<Double> linkedListSubtraction = new LinkedList<>();
    private LinkedList<Double> linkedListMultiplication = new LinkedList<>();
    private LinkedList<Double> linkedListDivision = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void mathOperation() {
        choosingProgram();
    }

    private void choosingProgram() {
        System.out.println("Введите значение 1, 2 или 3, где 1 - выход из программы, 2 - начать работу с калькулятором, 3 - вывод истории операций (массивы), 4 - вывод истории операций (коллекции), 5 - вывод истории операций (HashMap)");
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
            case 3:
                history.printOperationsHistory();
                choosingProgram();
                break;
            case 4:
                historyCollection.printOperationsHistory();
                choosingProgram();
                break;
            case 5:
                historyByHashMap.printOperationsHistory();
                choosingProgram();
                break;
            default:
                try {
                    throw new CalculatorException();
                } catch (CalculatorException e) {
                    System.err.println("Вы ввели неверное значение!");
                } finally {
                    choosingProgram();
                }
        }
    }

    private double inputValueOfNumbers(String text) {
        System.out.println(text);
        double value = 0;
        if (!scanner.hasNextDouble()) {
            try {
                throw new CalculatorException();
            } catch (CalculatorException e) {
                System.err.println("Ошибка! Введенное значение должно быть числом.");
            }
            scanner.next();
            return inputValueOfNumbers(text);
        } else {
            return scanner.nextDouble();
        }
    }

    private void inputMathOperationType() {
        System.out.println("Введите тип математической операции (сложение, вычитание, умножение или деление)");
        String mathOperationType = scanner.next();
        double result = 0;
        switch (mathOperationType) {
            case "сложение":
                Addition addition = new Addition();
                result = addition.action(firstValueOfNumbers, secondValueOfNumbers);
                System.out.println("Результат выполнения математической операции равен " + result);
                history.addResultToHistory(result);
                historyCollection.addResultToHistory(result);
                linkedListAddition.add(result);
                historyByHashMap.addResultToHistory(mathOperationType, linkedListAddition);
                break;
            case "вычитание":
                Subtraction subtraction = new Subtraction();
                result = subtraction.action(firstValueOfNumbers, secondValueOfNumbers);
                System.out.println("Результат выполнения математической операции равен " + result);
                history.addResultToHistory(result);
                historyCollection.addResultToHistory(result);
                linkedListSubtraction.add(result);
                historyByHashMap.addResultToHistory(mathOperationType, linkedListSubtraction);
                break;
            case "умножение":
                Multiplication multiplication = new Multiplication();
                result = multiplication.action(firstValueOfNumbers, secondValueOfNumbers);
                System.out.println("Результат выполнения математической операции равен " + result);
                history.addResultToHistory(result);
                historyCollection.addResultToHistory(result);
                linkedListMultiplication.add(result);
                historyByHashMap.addResultToHistory(mathOperationType, linkedListMultiplication);
                break;
            case "деление":
                Division division = new Division();
                result = division.action(firstValueOfNumbers, secondValueOfNumbers);
                System.out.println("Результат выполнения математической операции равен " + result);
                history.addResultToHistory(result);
                historyCollection.addResultToHistory(result);
                linkedListDivision.add(result);
                historyByHashMap.addResultToHistory(mathOperationType, linkedListDivision);
                break;
            default:
                try {
                    throw new CalculatorException();
                } catch (CalculatorException e) {
                    System.err.println("Вы ввели неверное значение, попробуйте еще раз!");
                } finally {
                    inputMathOperationType();
                }
                break;
        }
    }
}