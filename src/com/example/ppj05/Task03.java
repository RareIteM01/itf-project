package com.example.ppj05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + " " + b + " " + c);
        int min = a;
        int mid = b;
        int max = c;

        if (b <= a && b <= c) {
            min = b;
            if (a < c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else if (c <= a && c <= b) {
            min = c;
            if (a < b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        } else if (b > c) {
            max = b;
            mid = c;
        }
        a = min;
        b = mid;
        c = max;
        System.out.println(a + " " + b + " " + c);
    }
}
