package javaEssential.hw5.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Lina Milorava");
        teachers.add("Ella Sarkisyan");
        teachers.add("Manana Kobaladze");
        System.out.println("The best - " + teachers.get(0));
        System.out.println("The worst - " + teachers.get(2));
    }
}
