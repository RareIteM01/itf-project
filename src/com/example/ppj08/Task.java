package com.example.ppj08;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        Task01
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
//        Task02
        for (int i = 2; i <= 1024; i *= 2) {
            System.out.println(i);
        }
        System.out.println();
//        Task03
        int index = 0;
        while (index < 3) {
            System.out.println("Iteration" + index++);
        }
        do {
            System.out.println("Iterations" + index++);
        }
        while (index < 3);
//        Task04
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        int allDays = 0;
        for (int i = 0; i < month; i++) {
            if (i == 2) {
                allDays += 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                allDays += 30;
            } else {
                allDays += 31;
            }
        }
        allDays += day;
        System.out.println(allDays);
//        Task05
        for (int rows = 0; rows < 7; rows++) {
            for (int col = 0; col < 7; col++) {
                if ((rows + col) % 2 == 0) {
                    System.out.print("o");
                } else System.out.print("x");
            }
            System.out.println();
        }
    }
}
