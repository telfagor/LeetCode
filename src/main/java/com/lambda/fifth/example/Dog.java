package com.lambda.fifth.example;

public class Dog extends Animal {

    public Dog(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Dog say meow");
    }

    @Override
    public void run() {
        System.out.println("Dog can run");
    }

    @Override
    public void play() {
        System.out.println("Dog can play");
    }

    @Override
    public String toString() {
        return String.format("Name: %s color: %s age: %d weight: %.2f", name, color, age, weight);
    }
}
