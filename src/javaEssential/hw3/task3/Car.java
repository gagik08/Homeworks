package javaEssential.hw3.task3;

public class Car extends Vehicle{
    public Car(int price, int year, double speed, double xCoordinate, double yCoordinate) {
        super(price, year, speed, xCoordinate, yCoordinate);
    }

    public String infoAboutCar() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", xCoordinate='" + xCoordinate + '\'' +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
