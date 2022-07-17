package com.lambda.second.example;

public class FindStudentUnderAge implements StudentChecks {
    @Override
    public boolean checkStudent(Student student) {
        return student.getAge() < 25;
    }
}
