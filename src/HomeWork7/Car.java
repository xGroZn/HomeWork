package HomeWork7;

import java.util.Random;

public class Car {
//    Создать собственное исключение
//- Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
//    Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным, то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт. Если все хорошо и исключение не вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
//    В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете исключение которое может вылететь при старте автомобиля
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarException {
        Random random = new Random();
        int number = random.nextInt(20);
        if (number % 2 == 0) {
            throw new CarException();
        } else {
            System.out.println("Автомобиль марки " + this.brand + " завелся");
        }
    }
}