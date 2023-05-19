package com.example.module05.spaceShip;

class Engine {
    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo();
    }

    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return "A500";
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;

    public String getFuelType() {
        return "XFuel";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }
}