package com.example.task1_9;

import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;

    static {
        POWERS_2 = new int[10];
        for (int i = 1; i <= 10; i++) {
            POWERS_2[i - 1] = i * i;
        }
    }
}

class PowTableTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}