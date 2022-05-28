package javaEssential.hw2.task4;

public class Car {
    private int year;
    private double velocity;
    private int weight;
    private String colour;

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String colour) {
        this(year);
        this.colour = colour;
    }

    public Car(int year, String colour, double velocity) {
        this(year,colour);
        this.velocity = velocity;
    }

    public Car(int year, String colour, double velocity, int weight) {
        this(year, colour, velocity);
        this.weight = weight;
    }
}
