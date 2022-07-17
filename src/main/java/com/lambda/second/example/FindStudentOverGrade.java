package com.lambda.second.example;

public class FindStudentOverGrade implements StudentChecks {
    @Override
    public boolean checkStudent(Student student) {
        return student.getAvgGrade() > 8.0;
    }
}
