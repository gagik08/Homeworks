package javaAdvanced.hw2.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Families {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> titularSurnames = new HashMap<>();
        System.out.print("How many titular surnames do you want to add?: ");
        int surnamesCount = scanner.nextInt();
        String city;
        String surname;
        for (int i = 0; i < surnamesCount; i++){
            System.out.println("City-surname pair №" + (i+1));
            System.out.print("City - ");
            city = scanner.next();
            scanner = new Scanner(System.in);
            System.out.print("Surname - ");
            surname = scanner.nextLine();
            titularSurnames.put(city,surname);
        }

        System.out.println("List of cities:");
        for (Map.Entry<String, String> cities : titularSurnames.entrySet()){
            System.out.println(cities.getKey());
        }

        while (true){
            System.out.print("Choose city of which surname you are interested in more: ");
            String selectedCity = scanner.nextLine();
            for (Map.Entry<String, String> cities : titularSurnames.entrySet()) {
                if (cities.getKey().equals(selectedCity)) {
                System.out.println(cities.getValue());
                break;
                }

                }
            }
        }
    }

