package javaStarter.hw3.task4;

import static java.lang.Math.pow;

public class Volume {
    public static void main(String[] args) {
        double r = 15.5;
        double h = 5.1;
        double vol = Math.PI * pow(r,2) * h;
        System.out.println("Volume of cylinder = " + vol);
        double cylinderArea = 2 * Math.PI * r * (r + h);
        System.out.println("Area of cylinder = " + cylinderArea);
    }
}
