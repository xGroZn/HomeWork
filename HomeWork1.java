public class HomeWork1 {
    public static void main(String[] args) {

//        1-Й ПРИМЕР
       byte a = 3;
       byte b = 127;
       float c = 3.5F;
       byte d = 1;
//       неявное приведение типов
       short aA = a;
       int bB = b;
       double cC = c;
       long dD = d;
//       Решение
       double primer1 = aA * bB / cC - dD;
//       Вывод ответа
       System.out.println(primer1);
//       явное приведение типов
       int primer11 = (int) primer1;
//       Вывод ответа
        System.out.println(primer11);



//        2-Й ПРИМЕР
        long e = 10 * 599;
        double f = 10 + 150;
        short g = 3 + 5;
//        явное приведение типов
        int eE = (int) e;
        float fF = (float) f;
        byte gG = (byte) g;
//        Решение
        float primer2 = eE / fF * gG;
//        Вывод ответа
        System.out.println(primer2);
//        неявное приведение типов
        double primer22 = primer2;
//        Вывод ответа
        System.out.println(primer22);



//        3-Й ПРИМЕР
        double h = (3 + 3)/(4.0 * 12) + 9 * 9 / 71;
        System.out.println(h);
//        явное приведение типов
        int hH = (int) h;
        System.out.println(hH);
    }
}
