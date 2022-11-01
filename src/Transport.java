public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public void information() {
        System.out.println("Мощность - " + this.power + " л/с");
        System.out.println("Максимальная скорость - " + this.maxSpeed + " км/ч");
        System.out.println("Масса - " + this.weight + " кг");
        System.out.println("Марка - " + this.brand);
        System.out.println("Мощность в киловатах - " + powerInKW(this.power));
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private double powerInKW(double powerInKW) {
        powerInKW = this.power * 0.74;
        return powerInKW;
    }

}
