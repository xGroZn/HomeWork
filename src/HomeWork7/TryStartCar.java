package HomeWork7;

public class TryStartCar {
    public static void main(String[] args) {
        Car firstCar = new Car("Nissan", 200, 10000);
        Car secondCar = new Car("BMW", 300, 40000);
        Car thirdCar = new Car("Infinity", 270, 30000);

        try {
            firstCar.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            secondCar.start();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            thirdCar.start();
        } catch (CarException e) {
            e.printStackTrace();
        }

    }
}