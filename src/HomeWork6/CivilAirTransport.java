package HomeWork6;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport{
    private int numPassengers;
    private boolean businessClassExist;

    public CivilAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthStrip, int numPassengers, boolean businessClassExist) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthStrip);
        this.numPassengers = numPassengers;
        this.businessClassExist = businessClassExist;
    }
    @Override
    public void information() {
        System.out.println("Характеристики гражданского воздушного транспорта:");
        super.information();
        System.out.println("Количество пассажиров - " + this.numPassengers);
        System.out.println("Наличие бизнес-класса - " + this.businessClassExist);
    }

    public void loadingCivilAirTransport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей");
        int passengers = scanner.nextInt();
        if (passengers > this.numPassengers) {
            System.out.println("Вам нужен самолет вместительнее!");
        } else if (passengers <= 0) {
            System.out.println("Колличество людей не может быть меньше или равно 0");
        } else {
            System.out.println("Самолет загружен");
        }
    }
}
