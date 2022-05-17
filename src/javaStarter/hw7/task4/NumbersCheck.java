package javaStarter.hw7.task4;

import java.util.Scanner;

public class NumbersCheck {
    static String isPositive(int num1){
        if (num1 > 0) return "Positive";
        else if (num1 == 0) return "Neither positive nor negative (null)";
        else return "Negative";
    }

    static boolean isPrime (int num2){
        if (num2 < 2)
            return false;
        for (int i = 2; i < num2; i++) {
            if (num2 % i == 0) return false;
        }
        return true;
    }

    static boolean withoutRemainder (int num3){
        boolean ans = (num3 % 2 == 0) ? false
                : (num3 % 3 == 0) ? false
                : (num3 % 5 == 0) ? false
                : (num3 % 6 == 0) ? false
                : (num3 % 9 == 0) ? false
                : true;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nСhecking for logical operations");
        System.out.println("Select the desired option for performing a logical operation -  1)Number is positive or negative");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2)Number is prime or not");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3)Is it divisible by 2, 5, 3, 6, 9 without a remainder");
        int option = sc.nextInt();
        System.out.print("Ok. Enter a number to perform the appropriate check : ");
        int num = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Checking. Number " + num + " is " + isPositive(num));
                break;
            case 2:
                System.out.println("Checking. Number " + num + " is prime: " + isPrime(num));
                break;
            case 3:
                System.out.println("Checking. Number " + num + " it divisible by 2, 5, 3, 6, 9 without a remainder:  " + withoutRemainder(num));
                break;
            default:
                System.out.println("Only 3 operations available");
        }
    }
}
