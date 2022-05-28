package javaEssential.hw3.task3;

public class Plane extends Vehicle{
    private int numberOfPassengers;
    private double flightAltitude;

    public Plane(int price, int year, double speed, double xCoordinate, double yCoordinate, int numberOfPassengers, double flightAltitude) {
        super(price, year, speed, xCoordinate, yCoordinate);
        this.numberOfPassengers = numberOfPassengers;
        this.flightAltitude = flightAltitude;
    }

    public String infoAboutPlane() {
        return "Plane{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", xCoordinate='" + xCoordinate + '\'' +
                ", yCoordinate=" + yCoordinate +
                ", numberOfPassengers=" + numberOfPassengers +
                ", flightAltitude=" + flightAltitude +
                '}';
    }
}
