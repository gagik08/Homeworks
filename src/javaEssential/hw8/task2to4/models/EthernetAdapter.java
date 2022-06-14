package javaEssential.hw8.task2to4.models;

public class EthernetAdapter {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return  "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}
