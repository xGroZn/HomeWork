package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class University {
    String universityTitle;
    ArrayList<String> studentsList = new ArrayList<>();
    Double averageMark;

    public University(String universityTitle, ArrayList<String> studentsList, Double averageMark) {
        this.universityTitle = universityTitle;
        this.studentsList = studentsList;
        this.averageMark = averageMark;
    }

    public void delStudent(ArrayList a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента для отчисления");
        String studentName = scanner.next();
        if (a.contains(studentName)) {
            a.remove(studentName);
            System.out.println("Студент успешно отчислен");
        } else {
            System.out.println("Такого студента в данном университете нет");
        }
    }

    public void searchingForStudent(ArrayList a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя искомого студента");
        String studentName = scanner.next();
        if (a.contains(studentName)) {
            System.out.println("Такой студент тут учится");
        } else {
            System.out.println("Такого студента в данном университете нет");
        }
    }

    public void addStudent(ArrayList a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента для зачисления в университет");
        String studentName = scanner.next();
        a.add(studentName);
        System.out.println("Студент " + studentName + " успешно добавлен!");
    }

    public String getUniversityTitle() {
        return universityTitle;
    }

    public void setUniversityTitle(String universityTitle) {
        this.universityTitle = universityTitle;
    }

    public ArrayList<String> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<String> studentsList) {
        this.studentsList = studentsList;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }
}
