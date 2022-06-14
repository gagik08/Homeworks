package javaAdvanced.hw1.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 15, 25, 5000);
        Animal dog = new Animal("Labrador", 15, 25, 5000);
        Animal bird = new Animal("King Penguin", 15, 25, 5000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
