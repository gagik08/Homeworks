package javaEssential.hw3.task3;

//import javaEssential.hw3.task3.Vehicle;
public class Ship extends Vehicle{
    private int numberOfPassengers;
    private String portOfRegistry;

    public Ship(int price, int year, double speed, double xCoordinate, double yCoordinate, int numberOfPassengers, String portOfRegistry ) {
        super(price, year, speed, xCoordinate, yCoordinate);
        this.numberOfPassengers = numberOfPassengers;
        this.portOfRegistry = portOfRegistry;
    }

    public String infoAboutShip() {
        return "Ship{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", xCoordinate='" + xCoordinate + '\'' +
                ", yCoordinate=" + yCoordinate +
                ", numberOfPassengers=" + numberOfPassengers +
                ", portOfRegistry=" + portOfRegistry +
                '}';
    }
}
