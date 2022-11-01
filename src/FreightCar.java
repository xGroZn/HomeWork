import java.util.Scanner;

public class FreightCar extends GroundTransport {
    private int loadCapacity;

    public FreightCar(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void information() {
        System.out.println("Характеристики грузового автомобиля:");
        super.information();
        System.out.println("Грузоподъемность - " + this.loadCapacity + " т.");
    }

    public void loadingFreightCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу груза в тоннах");
        int cargoWeight = scanner.nextInt();
        if (cargoWeight > this.loadCapacity) {
            System.out.println("Вам нужен грузовик побольше!");
        } else if (cargoWeight <= 0) {
            System.out.println("Масса груза не может быть меньше или равно 0");
        } else {
            System.out.println("Грузовик загружен");
        }
    }
}
