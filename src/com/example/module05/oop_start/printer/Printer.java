package com.example.module05.oop_start.printer;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.printString("Words"));
        System.out.println(printer.printNumber(34.089, 45));
        System.out.println(printer.printStrongAndInt("Word", 90));
        System.out.println(printer.printArray(new String[]{"name", "Surname", "Age"}));
    }
}

class Printer {
    public String printString(String message) {
        return message;
    }

    public String printNumber(double doubleNumber, int intNumber) {
        return (Integer.parseInt(String.valueOf(intNumber))) + "  " + Double.parseDouble(String.valueOf(doubleNumber));
    }

    public String printStrongAndInt (String word, int number) {
        return word + " and " + Integer.parseInt(String.valueOf(number));
    }

    public String printArray (String[] array) {
        return Arrays.toString(array);
    }
}
