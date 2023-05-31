package com.example.module05.spaceShip;

class Main {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        ship.printInfo();
    }
}

public class SpaceShip {
    private String name;
    private String serialNumber;

    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
