package com.lambda.fourth.example;

import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {
    public void printStudent(Student st) {
        System.out.println("Student's name: " + st.getName() + " Sex: " + st.getSex() +
                " Age: " + st.getAge() + " Course: " + st.getCourse() +
                " Average: " + st.getAvgGrade());
    }

    public void testStudent(List<Student> students, Test<Student> obj) {
        for (Student student : students) {
            if (obj.check(student)) {
                printStudent(student);
            }
        }
    }

    public void testStudentPredicate(List<Student> students, Predicate<Student> obj) {
        for (Student student : students) {
            if (obj.test(student)) {
                printStudent(student);
            }
        }
    }
}
