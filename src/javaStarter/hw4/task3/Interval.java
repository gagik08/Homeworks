package javaStarter.hw4.task3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        //[0 - 14] [15 - 35] [36 - 50][50 - 100]
    String interval;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    interval = (num>=0 && num <=14) ? "[0 - 14]"
            : (num>=15 && num <=35) ? "[15 - 35]"
            : (num>=36 && num <=50) ? "[36-50]"
            : (num>=51 && num <=100) ? "[51-100]"
            : "which is not defined in the code";
    System.out.println("The number you entered is in the range - " + interval);
}
}
