package javaEssential.hw3.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(3000, 2009, 210.5, 5,7);
        Vehicle ship = new Ship(15000, 2018, 510.7, 15,7, 210, "Antwerp");
        Vehicle plane = new Plane(150000, 2015, 1000.2, 86,105, 180, 105);
        System.out.println(((Car) car).infoAboutCar());
        System.out.println(((Ship) ship).infoAboutShip());
        System.out.println(((Plane) plane).infoAboutPlane());
    }
}
