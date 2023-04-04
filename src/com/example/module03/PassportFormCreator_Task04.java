package com.example.module03;

import java.util.Scanner;

public class PassportFormCreator_Task04 {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int years = scanner.nextInt();
        years *= 10;
        System.out.println(name + " " + surname + " " + years);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(years);
        scanner.close();
    }
}