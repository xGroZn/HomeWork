package HomeWork6;

public class GroundTransport extends Transport {
    private int numWheels;
    private int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numWheels = numWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
