public class AirTransport extends Transport{
    private int wingspan;
    private int minLengthStrip;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthStrip) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthStrip = minLengthStrip;
    }
}
