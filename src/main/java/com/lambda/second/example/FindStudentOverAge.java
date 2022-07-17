package com.lambda.second.example;

public class FindStudentOverAge implements StudentChecks {
    @Override
    public boolean checkStudent(Student student) {
        return student.getAge() > 25;
    }
}
