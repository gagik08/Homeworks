package javaStarter.hw8.task4;

import java.util.Scanner;

public class Calculator {
    static String calculator (int a, int b, int c){
        return (double)a/5 + " " + (double)b/5 + " " + (double)c/5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers and I will return the quotient of each divided by 5");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.println("Result: " + calculator(a, b, c));
    }
}
