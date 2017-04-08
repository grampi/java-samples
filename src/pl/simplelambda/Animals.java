package pl.simplelambda;

import java.util.Arrays;
import java.util.List;

public class Animals {

    String[] a = {"cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"};

    public void listAnimals() {
        List animals = Arrays.asList(a);

        animals.forEach((animal) -> System.out.println(animal + "; "));
        //lub
        //animals.forEach(System.out::println);
    }
}
