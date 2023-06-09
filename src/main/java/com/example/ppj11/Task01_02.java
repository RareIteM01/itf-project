package com.example.ppj11;

import java.util.Arrays;

public class Task01_02 {
    public static void main(String[] args) {
        int[] array = {23, 56, 12, 40, 80, 9};
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("TASK 1");
        System.out.println(max + " " + min);
        System.out.println(max - min);
        System.out.println("TASK 2");
        System.out.println(Arrays.toString(array));
        array[minIndex] = max;
        array[maxIndex] = min;
        System.out.println(Arrays.toString(array));
    }
}
