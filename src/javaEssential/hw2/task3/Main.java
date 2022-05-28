package javaEssential.hw2.task3;

public class Main {
    public static void main(String[] args) {
        Car carWithOnlyAge = new Car(2009);
        Car carWithAgeAndColour = new Car(2009, "Red");
        Car carWithAgeVelocityAndColour = new Car(2009, "Red", 210.5);
        Car car = new Car(2009, "Red", 210.5, 3400);
    }
}
