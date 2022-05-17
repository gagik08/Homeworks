package javaStarter.hw6.task4;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();
        int factorial = 1 ;
        int counter = 1;
        if ( n == 0 ) factorial = 1;
        else if ( n > 0 ) {
            do {
                factorial *= counter;
                counter++;
            }
            while (counter <= n);
            System.out.println( n+"! = " + factorial);
        }
        else System.out.println("Unable to calculate factorial for negative number");
    }
}
