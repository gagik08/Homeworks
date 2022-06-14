package javaEssential.hw8.task2to4;

import javaEssential.hw8.task2to4.models.EthernetAdapter;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private EthernetAdapter ethernetAdapter;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, EthernetAdapter ethernetAdapter) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public EthernetAdapter getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(EthernetAdapter ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    @Override
    public String toString() {
        return "Monitor{"+ "manufacturer=" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serialNumber='" + getSerialNumber() + '\''+
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", ethernetAdapter=" + ethernetAdapter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY && ethernetAdapter.equals(monitor.ethernetAdapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY, ethernetAdapter);
    }
}
