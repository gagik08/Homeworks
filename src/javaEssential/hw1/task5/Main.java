package javaEssential.hw1.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address address = new Address();
        System.out.println("I propose to add your address to our register. Let's start.");
        System.out.print("Country: ");
        address.setCountry(sc.nextLine());
        System.out.print("City: ");
        address.setCity(sc.nextLine());
        System.out.print("Postal index: ");
        address.setIndex(Integer.parseInt(sc.nextLine()));
        System.out.print("Street: ");
        address.setStreet(sc.nextLine());
        System.out.print("House: ");
        address.setHouse(Integer.parseInt(sc.nextLine()));
        System.out.print("Apartment: ");
        address.setApartment(Integer.parseInt(sc.nextLine()));
        System.out.println("\nFine. Your property has been added to the register.");
        System.out.println("Country: " + address.getCountry() + "\nCity: " + address.getCity()
            + "\nPostal index: " + address.getIndex() + "\nStreet: " + address.getStreet()
            + "\nHouse: " + address.getHouse() + "\nApartment: " + address.getApartment());
    }
}
