package javaStarter.hw6.task2;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the numbers A and B (A < B)," +
                "to get the sum of all the numbers in that interval." +
                "And also all odd numbers in ascending order");
        System.out.print("A : "); int a = sc.nextInt();
        System.out.print("B : "); int b = sc.nextInt();
        if (a < b) {
            System.out.print("Sequence of odd numbers :");
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1 || i % 2 == -1) System.out.print(" " + i);
            }

            while (a != b) {
                sum += a;
                a++;
            }
            System.out.println("\nThe sum of all numbers in a given interval is " + sum);
        }
        else System.out.println("A must be greater than B");
    }
}
