package javaEssential.hw8.task2to4;

import javaEssential.hw8.task2to4.models.EthernetAdapter;

public class Main {
    public static void main(String[] args) {
        String manufacturer = "Samsung";
        float price = 120f;
        String serialNumber = "AB1234567CD";
        int resolutionX = 1280;
        int resolutionY = 1024;
        EthernetAdapter ethernetAdapter = new EthernetAdapter(100, "00:00:5e:00:53:af");
        Device device = new Device(manufacturer,price,serialNumber);
        Monitor monitor = new Monitor(manufacturer,price,serialNumber,resolutionX,resolutionY,ethernetAdapter);
        System.out.println(device);
        System.out.println(monitor);

    }
}
