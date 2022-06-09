package javaEssential.hw5.task3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
            List <String> animals = new ArrayList<>();
            animals.add(0,"Elephant");
            animals.add(1,"Wolf");
            animals.add(2,"Fox");
            animals.add(3,"Zebra");
            animals.add(4,"Lion");
            animals.add(5,"Panda");
            animals.add(6,"Monkey");
            animals.add(7,"Lemur");
            System.out.println("Before deleting - " + animals);
            System.out.println("Size before deleting elements - " + animals.size());
            animals.remove(7);
            animals.remove(5);
            animals.remove(3);
            System.out.println("After deleting - " + animals);
            System.out.println("Size after deleting elements - " + animals.size());
    }
}
