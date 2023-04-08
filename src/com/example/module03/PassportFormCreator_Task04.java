package com.example.module03;

import java.util.Scanner;

public class PassportFormCreator_Task04 {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int earthYears = scanner.nextInt();
        int moonMonths = earthYears * 10;
        System.out.println(name + " " + surname + " " + moonMonths);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(moonMonths);
        scanner.close();
    }
}