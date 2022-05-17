package javaEssential.hw1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer[] dates = new Computer[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the computer data (memory size and brand) separated by a space");
        for (int i = 0; i < dates.length; i++) {
            System.out.println("Computer #" + (i+1));
            dates[i] = new Computer(sc.nextInt(),sc.nextLine());
        }

        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i].toString());
        }
    }
}
