package com.example.ppj05;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max = d;
        int min = d;

        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (a <= b && a <= c && a <= d) {
            min = a;
        }
        if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (b <= a && b <= c && b <= d) {
            min = b;
        }
        if (c >= a && c >= b && c >= d) {
            max = c;
        } else if (c <= a && c <= b && c <= d) {
            min = c;
        }
        System.out.println(max - min);

    }
}
