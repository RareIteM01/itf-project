package com.example.module05.spaceShip;

public class Tanker {
    public static void main(String[] args) {
        Tanker tanker1 = new Tanker();
        tanker1.setSerialNumber("SN504030");
        tanker1.refuel(300);
        System.out.println();
        Tanker tanker2 = new XFuelTanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300);
        System.out.println();
        Tanker tanker3 = new MX200Tanker();
        tanker3.setSerialNumber("SN504030");
        tanker3.refuel(300);
    }
    private String serialNumber;

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class XFuelTanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "MX200";
    }
}