package javaEssential.hw2.task5;

import java.util.Scanner;

import static javaEssential.hw2.task5.MyArea.areaOfCircle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle - ");
        double radius = sc.nextDouble();
        System.out.println("Area of circle = " + areaOfCircle(radius));
    }
}
