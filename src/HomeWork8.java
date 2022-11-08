import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class HomeWork8 {
    public static void main(String[] args) {
        String iLikeJava = "I like Java!!!";

//        1.Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        System.out.println(speaking(iLikeJava));

//        2.Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(iLikeJava.charAt(iLikeJava.length() - 1));

//        3.Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(iLikeJava.endsWith("!!!"));

//        4.Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(iLikeJava.startsWith("I like"));

//        5.Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(iLikeJava.contains("Java"));

//        6.Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(iLikeJava.indexOf("Java"));

//        7.Заменить все символы “а” на “о”.
        System.out.println(iLikeJava.replace("a", "o"));

//        8.Преобразуйте строку к верхнему регистру.
        System.out.println(iLikeJava.toUpperCase());

//        9.Преобразуйте строку к нижнему регистру.
        System.out.println(iLikeJava.toLowerCase());

//        10.Вырезать строку Java c помощью метода String.substring().
        System.out.println(iLikeJava.substring(iLikeJava.indexOf("Java"), iLikeJava.indexOf("!")));

//        11.Написать метод, который находит и выводит все слова палиндромы в тексте.
        String polyndrom = "appa oppo ghy heeh lol yrre";
        searchingPalindromes(polyndrom);
        System.out.println();

//        12.Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.
        String words = "a few words";
        printWordsFrom3To5Symbols(words);
        System.out.println();

//        13.Написать метод, который возвращает самое маленькое слово в тексте.
        System.out.println(searchingForTheSmallestWord(iLikeJava));

//        14.Написать метод, который возвращает самое большое слово в тексте.
        System.out.println(searchingForTheBiggestWord(iLikeJava));

//        15.Используя StringBuilder сделайте выражения 3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
//        16.Использовать метод append() несколько раз
        StringBuilder addition = new StringBuilder("3");
        StringBuilder subtraction = new StringBuilder("3");
        StringBuilder multiplication = new StringBuilder("3");
        String plus = " + ";
        String minus = " - ";
        String star = " * ";
        String secNum = "56";
        String equals = " = ";
        String thirdNum = "59";
        String foursNum = "-53";
        String fifthNum = "168";
        addition.append(plus + secNum + equals);
        addition.append(thirdNum);
        subtraction.append(minus + secNum);
        subtraction.append(equals + foursNum);
        multiplication.append(star);
        multiplication.append(secNum + equals + fifthNum);
        System.out.println("Сложение: " + addition);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);

//        17.Ввести 2 слова, состоящие из четного числа букв.
        String even = "read son book cool fun";
        printWordsConsistingOfEvenNumLetters(even);

//        18.Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        String randomText = "Поле мака";
        cuttingWords(randomText);
    }

//    ============================================= (МЕТОДЫ) =============================================

//        1.Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static String speaking (String text) {
        return text;
    }

//        11.Написать метод, который находит и выводит все слова палиндромы в тексте.
    public static void searchingPalindromes(String text) {
        String[] string = text.split(" ");
        for (int i = 0; i < string.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(string[i]);
            String temp = stringBuilder.reverse().toString();
            if (string[i].equals(temp)) {
                System.out.print(string[i] + " ");
            }
        }
    }

//        12.Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.
    public static void printWordsFrom3To5Symbols (String text) {
        String[] string = text.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() >= 3 && string[i].length() <= 5) {
                System.out.print(string[i] + " ");
            }
        }
    }

//        13.Написать метод, который возвращает самое маленькое слово в тексте.
    public static String searchingForTheSmallestWord(String text) {
        String[] string = text.split(" ");
        String temp = "nothing";
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i].length() <= string[i + 1].length()) {
                temp = string[i];
                string[i] = string[i + 1];
                string[i + 1] = temp;
            }
        }
        return string[string.length - 1];
    }

//         14.Написать метод, который возвращает самое большое слово в тексте.
    public static String searchingForTheBiggestWord(String text) {
        String[] string = text.split(" ");
        String temp = "nothing";
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i].length() >= string[i + 1].length()) {
                temp = string[i];
                string[i] = string[i + 1];
                string[i + 1] = temp;
            }
        }
        return string[string.length - 1];
    }

//        17.Ввести 2 слова, состоящие из четного числа букв.
    public static void printWordsConsistingOfEvenNumLetters(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] string = text.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() % 2 == 0) {
                stringBuilder.append(string[i] + " ");
            }
        }
        System.out.println(stringBuilder);
    }

//    18. Получить слово состоящее из первой половины первого слова и второй половины второго слова.
    public static void cuttingWords(String text){
        StringBuilder stringBuilder = new StringBuilder();
        String[] string = text.split(" ");
        int firstWordNum = string[0].length()/2;
        int secWordNum = string[1].length()/2;
        stringBuilder.append(string[0].substring(0, firstWordNum) + string[1].substring(secWordNum, string[1].length()));
        System.out.println(stringBuilder);
    }
}