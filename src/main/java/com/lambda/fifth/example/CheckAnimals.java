package com.lambda.fifth.example;

import java.util.List;
import java.util.function.Predicate;

public class CheckAnimals {
    public void testAnimal(List<? extends Animal> animals, Predicate<Animal> obj) {
        for (Animal animal : animals) {
            if (obj.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}
