package com.lambda.second.example;

public class FindAllBoys implements StudentChecks {
    @Override
    public boolean checkStudent(Student student) {
        return student.getSex() == 'm';
    }
}
