package com.lambda.fifth.example;

public class Cat extends Animal {

    public Cat(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Cat say meow");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }

    @Override
    public void play() {
        System.out.println("Cat can play");
    }

    @Override
    public String toString() {
        return String.format("Name: %s color: %s age: %d weight: %.2f", name, color, age, weight);
    }
}
