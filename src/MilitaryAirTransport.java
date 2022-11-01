package HomeWork6;

import java.security.spec.RSAOtherPrimeInfo;

public class MilitaryAirTransport extends AirTransport{
    private boolean catapult;
    private int numRocketsOnBoard;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minLengthStrip, boolean catapult, int numRocketsOnBoard) {
        super(power, maxSpeed, weight, brand, wingspan, minLengthStrip);
        this.catapult = catapult;
        this.numRocketsOnBoard = numRocketsOnBoard;
    }
    @Override
    public void information() {
        System.out.println("Характеристики военного воздушного транспорта");
        super.information();
        System.out.println("Наличие системы катапультирования - " + this.catapult);
        System.out.println("Количество ракет на борту - " + numRocketsOnBoard);
    }
    public void shooting() {
        if (this.numRocketsOnBoard > 0) {
            System.out.println("Ракета пошла...");
        } else if (this.numRocketsOnBoard == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Количество ракет не может быть отрицательным");
        }
    }

    public void ejection() {
        if (this.catapult) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
