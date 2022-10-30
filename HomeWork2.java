//public class HomeWork2 {
//    public static void main(String[] args) {
//
////        Задача 1.1
//        int a = 52;
//        if (a > 0) {
//            if (a > 0 && a < 10) {
//                System.out.println("Число положительное однозначное");
//            }
//            if (a > 9 && a < 100) {
//                System.out.println("Число положительное двузначное");
//            }
//            if (a > 99 && a < 1000) {
//                System.out.println("Число положительное трехзначное");
//            }
//        } else if (a < 0) {
//            if (a < 0 && a > -10) {
//                System.out.println("Число отрицательное однозначное");
//            }
//            if (a < -9 && a > -100) {
//                System.out.println("Число отрицательное двузначное");
//            }
//            if (a < -99 && a > -1000) {
//                System.out.println("Число отрицательное трехзначное");
//            }
//        }


//        Задача 1.2
//        int a = 5;
//        int b = 7;
//        int c = 40;
//        if (a + b > c && a + c > b && b + c > a) {
//            System.out.println("Треугольник существует");
//        } else {
//            System.out.println("Такой треугольник не существует");
//        }


//        Задача 1.3
//        int a = 0;
//        if (a > 0) {
//            System.out.println(a + 1);
//        } else if (a < 0) {
//            System.out.println(a - 2);
//
//        } else {
//            System.out.println(a = 10);
//        }


//        Задача 1.4
//        int a = 2;
//        int b = - 5;
//        int c = 14;
//        if (a > 0 && b > 0 && c > 0) {
//            System.out.println("Количество положительных чисел - 3");
//        } else if ((a <= 0 && b > 0 && c > 0) || (a > 0 && b <= 0 && c > 0) || (a > 0 && b > 0 && c <= 0)) {
//            System.out.println("Количество положительных чисел - 2");
//        } else if ((a < 0 && b < 0 && c < 0) || (a == 0 && b == 0 && c == 0)) {
//            System.out.println("Положительные числа отсутствуют");
//        } else {
//            System.out.println("Количество положительных чисел - 1");
//        }


//        Задача 1.5
//        int a = 1;
//        int b = - 2;
//        int c = 0;
//        int numPozitive = 0;
//        int numNegative = 0;
//        if (a > 0) {
//            numPozitive++;
//        } else if (a < 0) {
//            numNegative++;
//        }
//        if (b > 0) {
//            numPozitive++;
//        } else if (b < 0) {
//            numNegative++;
//        }
//        if (c > 0) {
//            numPozitive++;
//        } else if (c < 0) {
//            numNegative++;
//        }
//        System.out.println("Количество положительных чисел - " + numPozitive + ", количество отрицательных чисел - " + numNegative);


//      Задача 1.6
//        int a = 9;
//        int b = 8;
//        int c = a > b ? a : b;
//        System.out.println(c);


//        Задача 1.7
//        int a = 512;
//        if ((a == 0) || (a > 4 && a < 21) || (a%10 == 0) || (a%10 == 5) || (a%10 == 6) || (a%10 == 7) || (a%10 == 8) || (a%10 == 9) || (a%10 == 10)) {
//            System.out.println(a + " программистов");
//        } else if (a%10 == 1) {
//            System.out.println(a + " программист");
//        } else if (a < 0) {
//            System.out.println("значение не может быть меньше 0!");
//        } else if (a%100 == 11 || a%100 == 12 || a%100 == 13 || a%100 == 14 || a%100 == 15 || a%100 == 16 || a%100 == 17 || a%100 == 18 || a%100 == 19) {
//            System.out.println(a + " программистов");
//        } else if (a%10 == 2 || a%10 == 3 || a%10 == 4) {
//            System.out.println(a + " программиста");
//        }


//        Задача 2.1
//        double a = 10;
//        int b = 2;
//        double sum = a;
//        do {
//            a = a * 1.1;
//            sum = sum + a;
//            b++;
//        } while (b < 8);
//        System.out.println(sum);


//        Задача 2.2
//        int a = 2;
//        int num = 1;
//        for (int i = 3; i <= 24; i = i + 3) {
//            num = num * a;
//            System.out.println("Количество амеб через " + i + " ч. будет " + num);
//        }


//        Задача 2.3
//        int sum = 0;
//        for (int i = 1; i <= 256; i = i * 2) {
//            sum = sum + i;
//            System.out.println(sum);
//        }
//        System.out.println(sum);


//        Задача 2.4
//        int a = 10;
//        int b = 6;
//        int proizved = 0;
//        for (int i = 0; i < a; i++) {
//            proizved = proizved + b;
//        }
//        System.out.println(proizved);


//        Задача 2.5
//        double d = 2.54;
//        int i = 1;
//        do {
//            System.out.println(i + " дюйм(а)(ов) = " + d * i + " см");
//            i++;
//        } while (i < 21);


//        Задача 2.6
//        for (int i = 2; i < 101; i = i + 2) {
//            System.out.println(i);
//        }


//        Задача 2.7
//        int sum = 0;
//        for (int i = 1; i < 100; i = i + 2) {
//            sum = sum + i;
//        }
//        System.out.println(sum);


//        Задача 2.8
//        1 вариант
//        int num = 3;
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = num; i > 0; i--) {
//            for (int k = num - i; k > 0; k--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        2 вариант
//        for (int i = 0; i < 8; i++) {
//            if (i == 1) {
//                System.out.println("* * *");
//            } else if (i == 2) {
//                System.out.println("* *");
//            } else if (i == 3) {
//                System.out.println("*");
//            } else if (i == 4) {
//                System.out.println(" ");
//            } else if (i == 5) {
//                System.out.println("* * *");
//            } else if (i == 6) {
//                System.out.println("  * *");
//            } else if (i == 7) {
//                System.out.println("    *");
//            }
//        }


//        Задача 2.9
//        int prev = 0;
//        int current = 1;
//        int next = 0;
//        System.out.print("0 " + "1 ");
//        for (int i = 0; i < 15; i++) {
//            next = prev + current;
//            prev = current;
//            current = next;
//            System.out.print(next + " ");
//        }
//        System.out.println("и т.д.");


//        Задача 2.10
//        int value = 30;
//        for (int i = 1; i <= value; i++) {
//            if (value % i == 0) {
//                System.out.print(i + " ");
//            }
//        }


//        Задача 2.11
//        int value = 121;
//        int sum = 0;
//        for (int i = 1; i <= value; i++) {
//            int a = value % i;
//            if (a == 0) {
//                sum++;
//            }
//        }
//        if (sum > 2) {
//            System.out.println("Введенное число не является простым");
//        } else {
//            System.out.println("Введенное число является простым");
//        }


//        Задача 2.12 (я не знаю как это сделать проще :( )
//        int a = -54788;
//        int summ = 0;
//        if ((a > 0 && a < 100) || (a < 0 && a > -100)) {
//            summ = a / 10 + a % 10;
//        } else if ((a >= 100 && a < 1000) || (a <= -100 && a > -1000)) {
//            summ = a / 100 + a % 100 / 10 + a % 10;
//        } else if ((a >= 1000 && a < 10000) || (a <= -1000 && a > -10000)) {
//            summ = a / 1000 + a % 1000 / 100 + a % 100 / 10 + a % 10;
//        } else if ((a >= 10000 && a < 100000) || (a <= -10000 && a > -100000)) {
//            summ = a / 10000 + a % 10000 / 1000 + a % 1000 / 100 + a % 100 / 10 + a % 10;
//        } else if (a >= 100000 ) {
//            System.out.println("Я таких числе не знаю. Давай, до свидания");
//        }
//        if (summ < 0) {
//            System.out.println(summ * -1);
//        } else if (summ > 0) {
//            System.out.println(summ);
//        }

//        Вариант 2
//        int a = 555555555;
//        int num = 0;
//        int summ = 0;
//        for (int i = 0; a > 0; i++) {
//            num = a % 10;
//            summ = summ + num;
//            a = a / 10;
//        }
//        System.out.println(summ);

//    }
//}
