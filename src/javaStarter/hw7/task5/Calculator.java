package javaStarter.hw7.task5;

import java.util.Scanner;

public class Calculator {
    static void average (int a, int b, int c){
        System.out.println("The arithmetic mean of the three entered numbers is " + (double)(a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalculator that displays the arithmetic mean of three numbers");
        System.out.println("Enter three numbers: ");
        System.out.print("a = " );
        int a = sc.nextInt();
        System.out.print("b = " );
        int b = sc.nextInt();
        System.out.print("c = " );
        int c = sc.nextInt();
        average(a,b,c);
    }
}
