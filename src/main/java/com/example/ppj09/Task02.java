package com.example.ppj09;

public class Task02 {
    public static void main(String[] args) {
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            sum += 1 / (Math.pow(2, n));
            System.out.println(sum);
        }
    }
}
