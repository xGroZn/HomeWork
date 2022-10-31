import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
//
//public class HomeWork3 {
//    public static void main(String[] args) {

//        Задача 1.1
//        Условие: создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). Перед  созданием массива подумайте, какого он будет размера.
//
//        int[] array = new int[10];
//        for (int i = 0, value = 2; i < array.length; i++, value += 2) {
//            array[i] = value;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }



//        Задача 1.2
//        Условие: создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

//        int[] array = new int[50];
//        for (int i = 0, value = 1; i < array.length; i++, value += 2) {
//            array[i] = value;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }



//        Задача 1.3
//        Условие: создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
//
//        int[] array = new int[15];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(99);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0){
//                counter++;
//            }
//        }
//        System.out.println(counter);



//        Задача 1.4
//        Условие: создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

//        int[] array = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array[i] = 0;
//            }
//            System.out.print(array[i] + " ");
//        }



//        Задача 1.5
//        Условие: создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

//        int[] array1 = new int[15];
//        Random random = new Random();
//        int[] array2 = new int[15];
//        double summ1 = 0;
//        double summ2 = 0;
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = random.nextInt(15);
//            summ1 = summ1 + array1[i];
//            System.out.print(array1[i] + " ");
//        }
//        double average1 = summ1 / array1.length;
//        System.out.println();
//        System.out.println(average1);
//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt(15);
//            summ2 = summ2 + array2[i];
//            System.out.print(array2[i] + " ");
//        }
//        double average2 = summ2 / array2.length;
//        System.out.println();
//        System.out.println(average2);
//        System.out.println();
//        if (average1 > average2) {
//            System.out.println("Среднее арифметическое первого массива больше и составляет - " + average1);
//        } else if (average1 < average2) {
//            System.out.println("Среднее арифметическое второго массива больше и составляет - " + average2);
//        } else {
//            System.out.println("Средние арифметические двух массивов равны и составляют - " + average1);
//        }



//        Задача 1.6
//        Условие: создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью

//        int[] array = new int[4];
//        Random random = new Random();
//        int posledovat = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[i - 1]) {
//                posledovat = posledovat + 1;
//            }
//        }
//        System.out.println();
//        if (posledovat == (array.length - 1)) {
//            System.out.println("Индексы в массиве идут строго по-возрастанию");
//
//        } else if (posledovat < (array.length - 1) && posledovat >= 0) {
//            System.out.println("Индексы в массиве идут не по-возрастанию");
//        } else {
//            System.out.println("Что-то пошло не так...");
//        }



//        Задача 1.7 (Не решил)
//        Условие: создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

//        int[] array = new int[12];
//        Random random = new Random();
//        int num = 0;
//        int value = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(15);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                value = array[i];
//                num = i;
//                } else if (array[i] <= array[i + 1]) {
//                value = array[i + 1];
//                num = i + 1;
//
//                }
//            }
//        System.out.println(num);
//        System.out.println(value);



//        Задача 1.8
//        Условие: создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три  массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве

//        double[] array1 = new double [10];
//        double[] array2 = new double [10];
//        double[] array3 = new double[10];
//        Random random = new Random();
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = random.nextInt(9);
//            System.out.print(array1[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt(9);
//            System.out.print(array2[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 0; i < array3.length; i++) {
//            if (array2[i] != 0) {
//                array3[i] = array1[i] / array2[i];
//                System.out.print(array3[i] + "  ");
//            } else {
//                array3[i] = 0;
//                System.out.print(array3[i] + "  ");
//            }
//        }
//        System.out.println();
//        int numPozitive = 0;
//        int numZero = 0;
//        for (int i = 0; i < array3.length; i++) {
//            if (array3[i] % 1 == 0) {
//                numPozitive = numPozitive + 1;
//            }
//            if (array3[i] == 0) {
//                numZero = numZero + 1;
//            }
//        }
//        System.out.println("Количество целых элементов 3-го массива - " + numPozitive + ", из них нулей - " + numZero);



//        Задача 1.9
//        Условие: пользователь должен указать с клавиатуры положительное чётное число, а программа должна создать массив указанного размера из случайных целых чисел из [0;15] и вывести его на экран в строку. После этого программа должна определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи положительное чётное число с клавиатуры");
//        int num = scanner.nextInt();
//        if (num % 2 != 0 || num <= 0) {
//            System.out.println("Вы ввели неверное число!");
//        } else {
//            System.out.println(num);
//            int[] array = new int[num];
//            Random random = new Random();
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(15);
//                System.out.print(array[i] + " ");
//            }
//            int summHalfLeft = 0;
//            int summHalfRight = 0;
//            for (int i = 0; i < array.length / 2; i++) {
//                summHalfLeft = summHalfLeft + array[i];
//            }
//            for (int i = array.length / 2; i < array.length; i++) {
//                summHalfRight = summHalfRight + array[i];
//            }
//            System.out.println();
//            if (summHalfLeft > summHalfRight) {
//                System.out.println("Сумма значений левой половины массива больше, чем сумма значений правой половины");
//            } else if (summHalfLeft < summHalfRight) {
//                System.out.println("Сумма значений правой половины массива больше, чем сумма значений левой половины");
//            } else {
//                System.out.println("Сумма значений левой половины массива равна сумме значений правой половины");
//            }
//        }



//        Задача 1.10
//        Условие: пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n. Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение. Создать массив из n случайных
//        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив  только из чётных элементов первого массива, если они там есть, и вывести его на экран.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число больше 3");
//        int n = scanner.nextInt();
//        System.out.println(n);
//        Random random = new Random(n);
//        int[] array = new int[n];
//        if (n <= 3) {
//            System.out.println("Вы ввели неверное число!");
//        } else {
//            for (int i = 0; i < array.length; i++) {
//                array[i] = random.nextInt(n);
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
//        int num = 0;
//        for (int i = 0; i < n; i++) {
//            if (array[i] % 2 == 0 && array[i] != 0) {
//                num = num + 1;
//            }
//        }
//        if (num == 0) {
//            System.out.println("Положительные чётные числа в первом массиве отсутствуют");
//        } else {
//            int[] array2 = new int[num];
//            int index = 0;
//            for (int i = 0; i < n; i++) {
//                if (array[i] % 2 == 0 && array[i] != 0) {
//                    array2[index] = array[i];
//                    System.out.print(array2[index] + " ");
//                    index = index + 1;
//                }
//            }
//        }



//        Задача 1.11
//        Условие: реализовать сортировку пузырьком (по возрастанию или убыванию одну на выбор)

//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }



//        Задача 2.1
//        Условие: найти произведение элементов, кратных 3

//        int[] array = new int[10];
//        Random random = new Random();
//        int proizved = 1;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(30);
//            System.out.print(array[i] + " ");
//            if (array[i] % 3 == 0) {
//                proizved = proizved * array [i];
//            }
//        }
//        System.out.println();
//        System.out.print("Произведение элементов массива кратных 3 равно " + proizved);



//        Задача 2.2
//        Условие: найти среднее арифметическое элементов с нечетными номерами.

//        int[] array = new int[10];
//        Random random = new Random();
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(5);
//            System.out.print(array[i] + " ");
//        }
//        for (int i = 1; i < array.length; i = i + 2) {
//            summ = summ + array[i];
//        }
//        System.out.println();
//        System.out.println("Среднее арифметическое нечетных элементов массива равно " + summ);



//        Задача 2.3
//        Условие: найти средне арифметическое элементов массива, превосходящих некоторое число С.

//        int[] array = new int[10];
//        Random random = new Random();
//        int c = 5;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        double num = 0;
//        double summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > c) {
//                num += 1;
//                summ += array[i];
//            }
//        }
//        double average = summ / num;
//        System.out.println();
//        System.out.println(average);



//        Задача 2.4
//        Условие: найти наименьший нечетный элемент

//        int[] array = new int[6];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        int temp = 0;
//        for (int i = 1; i < array.length - 2; i += 2) {
//            if (array[i] < array[i + 2]) {
//                temp = array[i];
//                array[i] = array[i + 2];
//                array[i + 2] = temp;
//            } else {
//                temp = array[i + 2];
//            }
//        }
//        System.out.println();
//        System.out.println(temp);



//        Задача 2.5
//        Условие: «сожмите» массив, выбросив из него каждый второй элемент. «Освободившиеся» места массива заполните нулями

//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.print(array[i] + " ");
//            } else {
//                array[i] = 0;
//                System.out.print(array[i] + " ");
//            }
//        }



//        Задача 2.6
//        Условие: проверить, различны ли все элементы массива.

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Введите длину массива");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        int num = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                num += 1;
//            }
//        }
//        System.out.println();
//        if (num > 0) {
//            System.out.println("Не все элементы массива различны");
//        } else {
//            System.out.println("Все элементы массива различны");
//        }



//        Задача 2.7
//        Условие: подсчитать, сколько раз встречается элемент с заданным значением

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Введите длину массива");
//        int n = scanner.nextInt();
//        System.out.println("Введите число, которое будет сравниваться с элементами массива на предмет равенства");
//        int value = scanner.nextInt();
//        int num = 0;
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(5);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                num += 1;
//            }
//        }
//        if (num > 0) {
//            System.out.println("Заданное число встречается в массиве " + num + " раз");
//        } else {
//            System.out.println("Заданное число не встречается в массиве");
//        }



//        Задача 2.8
//        Условие: найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Введите длину массива");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        int num = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[array.length - 1] == array[array.length - 1 - i]) {
//                num += 1;
//            }
//        }
//        System.out.println();
//        if (num > 1) {
//            System.out.println("Второй наибольший элемент равен " + array[array.length - 1 - num]);
//        } else if (num == array.length - 1) {
//            System.out.println("Все элементы массива равны");
//        } else {
//            System.out.println("Второй наибольший элемент равен " + array[array.length - 2]);
//        }



//        Задача 2.9 (Работает не всегда)
//        Условие: найти наименьший элемент среди элементов с четными индексами массива

//        int[] array = new int[11];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int num = 2;
//        int temp = 0;
//        for (int i = 2; i < array.length - 2; i += 2) {
//                if (array[i] <= array [i + 2]) {
//                    array[i + 2] = array[i];
//                } else {
//                    num += 2;
//                }
//        }
//        if (num == 2 && (array.length - 1) % 2 == 0) {
//            System.out.println("Наименьший элемент со значением индекса " + (array.length - 1) + " равен " + array[array.length - 1]);
//        } else if (num == 2 && (array.length - 2) % 2 == 0) {
//            System.out.println("Наименьший элемент со значением индекса " + (array.length - 2) + " равен " + array[array.length - 2]);
//        } else {
//            System.out.println("Наименьший элемент со значением индекса " + num + " равен " + array[num]);
//        }



//        Задача 2.10 (Не решил)
//        Условие: найти максимальный элемент в массиве и поменять его местами с нулевым элементом

//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//        }
//        int num = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1 + i; j < array.length - 1; j++) {
//                if (array[i] < array[j]) {
//
//                }
//            }
//        }
//    }
//}
