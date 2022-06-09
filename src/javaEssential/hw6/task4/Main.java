package javaEssential.hw6.task4;

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.CAR;
        Vehicles train = Vehicles.TRAIN;
        Vehicles motorcycle = Vehicles.MOTORCYCLE;
        Vehicles[] vehicles = {car,train,motorcycle};
        for (Vehicles vh : vehicles){
            System.out.println(vh);
            System.out.println(vh.getColor());
        }
    }
}
