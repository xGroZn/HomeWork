package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private Integer age;
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(Integer age, String name, ArrayList<Integer> marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public double mathAverageMark(ArrayList<Integer> a){
        int summMarks = 0;
        for (int i = 0; i < a.size(); i++) {
            summMarks += a.get(i);
        }
        return summMarks/a.size();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}
