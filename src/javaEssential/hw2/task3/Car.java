package javaEssential.hw2.task3;

public class Car {
    private int year;
    private double velocity;
    private int weight;
    private String colour;

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public Car(int year, String colour, double velocity) {
        this.year = year;
        this.velocity = velocity;
        this.colour = colour;
    }

    public Car(int year, String colour, double velocity, int weight) {
        this.year = year;
        this.velocity = velocity;
        this.weight = weight;
        this.colour = colour;
    }
}
