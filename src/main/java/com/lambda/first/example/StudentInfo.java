package com.lambda.first.example;

import java.util.List;

public class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Student's name: " + st.getName() + " Sex: " + st.getSex() +
                " Age: " + st.getAge() + " Course: " + st.getCourse() +
                " Average: " + st.getAvgGrade());
    }

    void printStudentsOverGrade(List<Student> students, double averageGrade) {
        for (Student student : students) {
            if (student.getAvgGrade() > averageGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderGrade(List<Student> students, double averageGrade) {
        for (Student student : students) {
            if (student.getAvgGrade() < averageGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsOverAge(List<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() > age) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderAge(List<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() < age) {
                printStudent(student);
            }
        }
    }

    void printStudentsBySex(List<Student> students, char sex) {
        for (Student student : students) {
            if (student.getSex() == sex) {
                printStudent(student);
            }
        }
    }

    void printStudentsMixConditions(List<Student> students, double averageGrade, char sex, int age) {
        for (Student student : students) {
            if (student.getAvgGrade() > averageGrade && student.getSex() == sex && student.getAge() == age) {
                printStudent(student);
            }
        }
    }
}
