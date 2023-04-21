package com.example.ppj09;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a byte value between 0 and 15: ");
        byte byteValue = input.nextByte();

        char hexValue = getHexValue(byteValue);
        System.out.println("The hexadecimal value is: " + hexValue);
    }
    public static char getHexValue(byte byteValue) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return hexDigits[byteValue];
    }
}
