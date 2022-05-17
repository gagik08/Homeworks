package javaStarter.hw7.task3;

import java.util.Scanner;

public class Conversion {
    static double converting(double moneyAmount, double exchangeRate) {
        return moneyAmount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCurrency Converter");
        System.out.print("Enter the desired amount to convert: ");
        double moneyAmount = sc.nextDouble();
        System.out.print("Enter the rate for currency conversion: ");
        double exchangeRate = sc.nextDouble();

        System.out.println("Amount to receive - " + converting(moneyAmount,exchangeRate) + " in the relevant currency.");
    }
}
