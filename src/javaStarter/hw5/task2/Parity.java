package javaStarter.hw5.task2;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("First solution");
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();
        if ((num1 & 1) == 0) System.out.println(num1 + " is an even number.");
        else System.out.println(num1 + " is an odd number.");


        System.out.println("--------------------------");
        System.out.println("Second solution");
        System.out.println("Enter the number :");
        int num2 = sc.nextInt();
        if ((num2 ^ 1) > num2) System.out.println(num2 + " is an even number.");
        else System.out.println(num2 + " is an odd number.");
    }
}
