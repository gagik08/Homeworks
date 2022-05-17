package javaEssential.hw1.task4;

public class Computer {
    private int ram;
    private String brand;

    public Computer(int ram, String brand) {
        this.ram = ram;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" + "ram = " + ram + ", brand = " + brand + "}";
    }
}
