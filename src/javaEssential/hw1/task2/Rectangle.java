package javaEssential.hw1.task2;

import java.util.Scanner;

public class Rectangle {
//
    static double areaCalculator(double side1, double side2){
        return side1*side1;
    }

    static double perimeterCalculator(double side1, double side2){
        return 2*(side1+side2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the sides of the rectangle and I'll output its area and perimeter");
        System.out.print("length: ");
        int length = sc.nextInt();
        System.out.print("width: ");
        int width = sc.nextInt();

        System.out.println("Area of a rectangle: " + areaCalculator (length, width));
        System.out.println("Perimeter of a rectangle: " + perimeterCalculator (length, width));
    }
}
