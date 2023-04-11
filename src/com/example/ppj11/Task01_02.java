package com.example.ppj11;

import java.util.Arrays;

public class Task01_02 {
    public static void main(String[] args) {
        int[] array = {23, 56, 12, 40, 80, 9};
        int maxIndex = array[0];
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = array[i];
            }
            if (array[i] < minIndex) {
                minIndex = array[i];
            }
        }
        System.out.println("TASK 1");
        System.out.println(maxIndex + " " + minIndex);
        System.out.println(maxIndex - minIndex);
        System.out.println("TASK 2");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minIndex) {
                array[i] = maxIndex;
            } else if (array[i] == maxIndex) {
                array[i] = minIndex;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
