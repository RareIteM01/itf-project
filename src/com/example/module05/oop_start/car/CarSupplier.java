package com.example.module05.oop_start.car;

public class CarSupplier {
    public static Car[] supply() {
        Car[] cars = new Car[10];
        cars[0] = new Car(1, "BMW", "X5", 2023, "Black", 89999.99, "BA34I0");
        cars[1] = new Car(2, "Opel", "Astra", 2019, "White", 15000.00, "SX34I");
        cars[2] = new Car(3, "Toyota", "Land-Cruiser", 2015, "Orange", 34000.00, "KLS6F");
        cars[3] = new Car(4, "Ferrari", "SF90", 2022, "Red", 223000.00, "URG9IB");
        cars[4] = new Car(5, "Lamborghini", "Aventador", 2021, "Orange", 150000.00, "HDGVB90");
        cars[5] = new Car(6, "BMW", "M850I", 2022, "Green", 100000.00, "FFKJB45");
        cars[6] = new Car(7, "Mercedes", "GLE", 2020, "White", 85000.00, "DFC1M0");
        cars[7] = new Car(8, "Hundai", "Tucson", 2018, "Gary", 28000.00, "WEZ109");
        cars[8] = new Car(9, "Audi", "RS7", 2021, "Black", 120000.00, "VEDG347");
        cars[9] = new Car(10, "Nissan", "GTR", 2012, "white", 75000.00, "BCDKJB9");
        return cars;
    }
}
