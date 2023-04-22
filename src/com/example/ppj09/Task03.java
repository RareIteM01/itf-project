package com.example.ppj09;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        for (byte i = 0; i <= 15; i++) {
            System.out.println(getHexValue(i));
        }
    }

    public static char getHexValue(byte byteValue) {
        String str = Integer.toHexString(byteValue);
        System.out.println(str);
        return str.charAt(0);
    }
}
