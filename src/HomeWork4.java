import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
//Условие для всех задач: Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//        матрицы).

//        Задача 1
//        Условие: посчитать сумму четных элементов стоящих на главной диагонали.
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Введите размер матрицы");
//        int n = scanner.nextInt();
//        int[][] array = new int[n][n];
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = random.nextInt(50);
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (array[i][i] % 2 ==0) {
//                sum += array[i][i];
//            }
//        }
//        System.out.println(sum);



//        Задача 2
//        Условие: вывести нечетные элементы находящиеся под главной диагональю(включительно)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int n = scanner.nextInt();
//        Random random = new Random();
//        int[][] array = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = random.nextInt(50);
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.print("Ответ - ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (array[i][j] % 2 != 0) {
//                    System.out.print(array[i][j] + " ");
//                }
//            }
//        }



//        Задача 3
//        Условие: проверить произведение элементов какой диагонали больше.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int n = scanner.nextInt();
//        int[][] array = new int[n][n];
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = random.nextInt(10);
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        int proizvedMain = 1;
//        int proizvedSide = 1;
//        for (int i = 0; i < n; i++) {
//            proizvedMain = proizvedMain * array[i][i];
//        }
//        System.out.println(proizvedMain);
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1 - i; j >= n - 1 - i; j--) {
//                proizvedSide = proizvedSide * array[i][j];
//            }
//        }
//        System.out.println(proizvedSide);
//        if (proizvedMain > proizvedSide) {
//            System.out.println("Произведение элементов главной диагонали больше, чем побочной");
//        } else if (proizvedMain < proizvedSide) {
//            System.out.println("Произведение элементов побочной диагонали больше, чем главной");
//        } else {
//            System.out.println("Произведение элементов главной и побочной диагоналей равны");
//        }



//        Задача 4
//        Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int n = scanner.nextInt();
//        int[][] array = new int[n][n];
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = random.nextInt(10);
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        int summ = 0;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 1 + i; j < n; j++) {
//                if (array[i][j] % 2 == 0) {
//                    summ += array[i][j];
//                }
//            }
//        }
//        if (summ == 0) {
//            System.out.println("Над побочной диагональю отсутствуют четные элементы");
//        } else {
//            System.out.println("Сумма четных элементов, стоящих над побочной диагональю равна " + summ);
//        }



//        Задача 5
//        Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int n = scanner.nextInt();
//        int[][] array = new int[n][n];
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = random.nextInt(10);
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            temp = array [i][0];
//            array[i][0] = array[0][i];
//            array[0][i] = temp;
//        }
//        int temp2 = 0;
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < n - 1; j++) {
//                temp2 = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp2;
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
    }
}
