package com.example.module05.oop_start.car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = CarSupplier.supply();
        System.out.println(Arrays.toString(filterByYear(cars, 2023)));
    }

    private static void method1(Car[] cars) {
        for (Car car : cars) {
            if (car.getBrand().equals("Ferrari")) {
                System.out.println(car);
            }
        }
    }

    private static void method2(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals("Ferrari")) {
                System.out.println(cars[i]);
            }
        }
    }

    private static Car[] filterByYear(Car[] cars, int currentYear) {
        int count = 0;
        for (Car car : cars) {
            if (currentYear - car.getIssueYear() >= 5) {
                count++;
            }
        }

        Car[] filteredCars = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (currentYear - car.getIssueYear() >= 5) {
                filteredCars[index++] = car;
            }
        }

        return filteredCars;
    }


    private static void filterByYearAndPrice(Car[] cars, int issueYear, double price) {
        for (Car car : cars) {
            if (car.getIssueYear() == issueYear && car.getPrice() >= price) {
                System.out.println(car);
            }
        }
    }
}