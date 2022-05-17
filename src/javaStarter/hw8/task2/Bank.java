package javaStarter.hw8.task2;

import java.util.Scanner;

public class Bank {
    static int remainder=700;
    static int paymentCounter = 0;
    static int credit(int deposit){
        if (deposit >= 100){
            remainder -= deposit;
            System.out.println("Left to pay - " + remainder);
            ++paymentCounter;
        }
        else System.out.println("The deposit must be at least 100 hryvnia, monthly.");
        return remainder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deposit;
        while (remainder > 0){
            System.out.println("Enter the deposit amount to pay off a loan of " +  remainder + " hryvnia");
            deposit = sc.nextInt();
            credit(deposit);
        }
        System.out.println("You paid off your loan of 700 hryvnias by making " + paymentCounter + " payments");
    }
}
