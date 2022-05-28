package javaEssential.hw2.task4;

import javaEssential.hw2.task3.Car;

public class Main {
    public static void main(String[] args) {
        Car carWithOnlyYear = new Car(2009);
        Car carAgeAndColour = new Car(2009, "Red");
        Car carAgeVelocityAndColour = new Car(2009, "Red", 210.5);
        Car car = new Car(2009,"Red",210.5, 3400);
    }
}
