package javaStarter.hw8.task3;

import java.util.Scanner;

public class Delivery {
    static int sum = 0;
    static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        else {
            if (n != 1) sum += n * factorial(n-1);
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of clients: ");
        int clients = sc.nextInt();
        if ( clients < 0)
            System.out.println("The number of clients cannot be negative.");
        else
            System.out.println("The number of possible options for the delivery of goods - " + factorial(clients));
    }
}
