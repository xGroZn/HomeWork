import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class HomeWork5_Calculator {
//    Создать класс Калькулятор.
//    В нем будет 2 переменные.
//    Создать конструктор для инициализации этих полей.
//    Создать 4 метода, которые реализуют основные математические операции.
    double firstValue;
    double secondValue;

    public HomeWork5_Calculator(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первого числа");
        double firstValue = scanner.nextInt();
        System.out.println("Введите значение второго числа");
        double secondValue = scanner.nextInt();
        System.out.println("Сумма чисел равна - " + addition(firstValue, secondValue));
        System.out.println("Разница чисел равна - " + subtraction(firstValue, secondValue));
        System.out.println("Произведение чисел равно - " + multiplication(firstValue, secondValue));
        System.out.println("Деление чисел равно - " + delenie(firstValue, secondValue));
    }

    public static double addition(double a, double b) {
        double value = a + b;
        return value;
    }

    public static double subtraction(double a, double b) {
        double value = a - b;
        return value;
    }

    public static double multiplication(double a, double b) {
        double value = a * b;
        return value;
    }

    public static double delenie(double a, double b) {
        double value = a / b;
        return value;
    }
}
