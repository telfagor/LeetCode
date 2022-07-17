package com.lambda.fourth.example;

import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String LINE = "-----------------------------";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>() {{
            add(new Student("Ivan", 'm', 23, 3, 8.3));
            add(new Student("Nikolay", 'm', 28, 2, 6.4));
            add(new Student("Elena", 'f', 19, 1, 8.9));
            add(new Student("Petr", 'm', 35, 4, 7.0));
            add(new Student("Maria", 'f', 23, 3, 9.2));
        }};

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudent(students, st -> st.getAvgGrade() > 8.0);
        System.out.println(LINE);
        studentInfo.testStudent(students, st -> st.getAvgGrade() < 8.0);
        System.out.println(LINE);
    }
}
