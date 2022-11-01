import java.util.Scanner;

public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int numPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption, String bodyType, int numPassengers) {
        super(power, maxSpeed, weight, brand, numWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numPassengers = numPassengers;
    }
    @Override
    public void information() {
        System.out.println("Характеристики легкового автомобиля:");
        super.information();
        System.out.println("Тип кузова - " + this.bodyType);
        System.out.println("Количество пассажиров - " + this.numPassengers);
    }
    private double drivingTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время движения легкового автомобиля");
        double time = scanner.nextInt();
        return time;
    }
    private double calculationFuel() {
        double time = drivingTime();
        double fuel = time * this.getMaxSpeed() / 100 * this.getFuelConsumption();
        return fuel;
    }
    public void calculationPath() {
        double fuel = calculationFuel();
        double time = fuel * 100 / (this.getMaxSpeed() * this.getFuelConsumption()) ;
        System.out.println("За время - " + time + " ч, автомобиль " + this.getBrand() + " двигаясь с максимальной скоростью " + this.getMaxSpeed() + " км/ч проедет " + this.getMaxSpeed() * time + " км и израсходует " + fuel + " литров топлива.");
    }
}
