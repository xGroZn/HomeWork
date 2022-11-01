import java.util.Random;
import java.util.Scanner;

public class HomeWork5_Computer {

//    Создать класс компьютер.
//    Поля:
//    - процессор (String)
//    - оперативка (int)
//    - жесткий диск (int)
//    - ресурс полных циклов работы (включений/выключений) (int)
//    Методы:
//    - метод описание(вывод всех полей)
//    - метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
//    - выключить (аналогично включению)
//    - при превышении лимита ресурса комп сгорает

    String processor;
    int RAM;
    int HDD;
    int valueCycles;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean works;
    boolean burnedDown;

    public HomeWork5_Computer(String processor, int RAM, int HDD, int valueCycles) {
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.valueCycles = valueCycles;
    }

    public void printInformation() {
        System.out.println("Процессор - " + this.processor);
        System.out.println("Оперативная память - " + this.RAM + " ГБ");
        System.out.println("Жесткий диск - " + this.HDD + " ГБ");
        System.out.println("Ресурс полных циклов работы (включений/выключений) - " + this.valueCycles);
    }

    public void computerTurnOn() {
        if (burnedDown) {
            System.out.println("Компьютер сгорел!");
            return;
        } else if (works) {
            System.out.println("Компьютер уже работает");
            return;
        }
        if (valueCycles > 0) {
            int randomValue = random.nextInt(2);
            System.out.println("Введите цифру 0 или 1");
            int value = scanner.nextInt();
            if (randomValue == value) {
                System.out.println("Компьютер включен");
                works = true;
            } else {
                System.out.println("Компьютер сгорел!");
                burnedDown = true;
            }
        }
    }

    public void computerTurnOff() {
        if (burnedDown) {
            System.out.println("Компьютер сгорел!");
            return;
        } else if (!works) {
            System.out.println("Компьютер и так уже выключен");
            return;
        }
        if (valueCycles > 0) {
            int randomValue = random.nextInt(2);
            System.out.println("Введите цифру 0 или 1");
            int value = scanner.nextInt();
            if (randomValue == value) {
                System.out.println("Компьютер выключен");
                works = false;
                valueCycles--;
            } else {
                System.out.println("Компьютер сгорел!");
                burnedDown = true;
            }
        } else {
            System.out.println("Компьютер не работает");
        }
    }
}
