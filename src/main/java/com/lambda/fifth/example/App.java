package com.lambda.fifth.example;

import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String LINE = "------------------------";

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>() {{
            add(new Dog("Barsik", "black", 3, 3.4));
            add(new Dog("Cezar", "brown", 4, 5.1));
            add(new Dog("Recs", "white", 1, 2.2));
            add(new Dog("Liuk", "black", 5, 3.8));
            add(new Dog("Ralph", "brown", 4, 4.5));
        }};

        List<Cat> cats = new ArrayList<>() {{
            add(new Cat("Musik", "black", 3, 3.4));
            add(new Cat("Pufu", "brown", 4, 5.1));
            add(new Cat("Simba", "white", 1, 2.2));
            add(new Cat("Melc", "black", 5, 3.8));
            add(new Cat("Codobelc", "brown", 4, 4.5));
        }};

        CheckAnimals dogsAndCats = new CheckAnimals();
        System.out.println("Dogs");
        dogsAndCats.testAnimal(dogs, dog -> dog.age > 2);
        System.out.println(LINE);
        dogsAndCats.testAnimal(dogs, dog -> dog.age < 4);
        System.out.println(LINE);
        dogsAndCats.testAnimal(dogs, dog -> dog.weight > 3.2);
        System.out.println(LINE);

        System.out.println();
        System.out.println("Cats");
        dogsAndCats.testAnimal(cats, cat -> cat.color.equals("black"));
        System.out.println(LINE);
        dogsAndCats.testAnimal(cats, cat -> !cat.color.equals("black"));
        System.out.println(LINE);
        dogsAndCats.testAnimal(cats, cat -> cat.name.equals("Pufu"));
    }
}
