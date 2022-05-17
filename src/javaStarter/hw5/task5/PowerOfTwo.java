package javaStarter.hw5.task5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see if it's a power of two: ");
        int powOfTwo = sc.nextInt();

        if ((powOfTwo & (powOfTwo-1)) == 0) System.out.println("Yes, it's a power of two.");
        else System.out.println("No, it's not a power of two.");
    }
}
