package com.lambda.third.example;

import java.util.List;

public class StudentInfo {
    public void printStudent(Student st) {
        System.out.println("Student's name: " + st.getName() + " Sex: " + st.getSex() +
                " Age: " + st.getAge() + " Course: " + st.getCourse() +
                " Average: " + st.getAvgGrade());
    }

    public void testStudents(List<Student> students, StudentChecks obj) {
        for (Student student : students) {
            if (obj.checkStudent(student)) {
                printStudent(student);
            }
        }
    }
}
