package Study;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Студенты
        ArrayList<Integer> alexMarks = new ArrayList<>(5);
        alexMarks.add(5);
        alexMarks.add(5);
        alexMarks.add(5);
        alexMarks.add(5);
        alexMarks.add(5);

        ArrayList<Integer> olesyaMarks = new ArrayList<>(5);
        olesyaMarks.add(4);
        olesyaMarks.add(5);
        olesyaMarks.add(3);
        olesyaMarks.add(5);
        olesyaMarks.add(4);

        ArrayList<Integer> michaelMarks = new ArrayList<>(5);
        michaelMarks.add(3);
        michaelMarks.add(5);
        michaelMarks.add(4);
        michaelMarks.add(5);
        michaelMarks.add(4);

        ArrayList<Integer> ninaMarks = new ArrayList<>(5);
        ninaMarks.add(4);
        ninaMarks.add(5);
        ninaMarks.add(5);
        ninaMarks.add(3);
        ninaMarks.add(5);

        Student alex = new Student(18, "Алексей", alexMarks);
        Student olesya = new Student(18, "Олеся", olesyaMarks);
        Student michael = new Student(18, "Михаил", michaelMarks);
        Student nina = new Student(18, "Нина", ninaMarks);

//        Университеты
        ArrayList<String> bntuStudentsList = new ArrayList<>();
        bntuStudentsList.add(alex.getName());
        bntuStudentsList.add(olesya.getName());
        Double bntuRating = (alex.mathAverageMark(alexMarks) + olesya.mathAverageMark(olesyaMarks)) / bntuStudentsList.size();

        ArrayList<String> bguStudentsList = new ArrayList<>();
        bguStudentsList.add(michael.getName());
        bguStudentsList.add(nina.getName());
        Double bguRating = (michael.mathAverageMark(michaelMarks) + nina.mathAverageMark(ninaMarks)) / bntuStudentsList.size();

        University bntu = new University("БНТУ", bntuStudentsList, bntuRating);
        University bgu = new University("БГУ", bguStudentsList, bguRating);

        System.out.println("Рейтинг университета " + bntu.getUniversityTitle() + " равен " + bntu.getAverageMark());
        System.out.println("Рейтинг университета " + bgu.getUniversityTitle() + " равен " + bgu.getAverageMark());

        System.out.println(bntuStudentsList); //список студентов БНТУ
        bntu.delStudent(bntuStudentsList); //отчисление студента
        System.out.println(bntuStudentsList); //список после отчисления
        bntu.searchingForStudent(bntuStudentsList); //поиск студента
        bgu.addStudent(bguStudentsList); //зачисление студента
        System.out.println(bguStudentsList); //список студентов после зачисления
    }
}
