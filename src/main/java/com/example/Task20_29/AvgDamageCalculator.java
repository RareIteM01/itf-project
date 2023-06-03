package com.example.Task20_29;

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        try {
            for (int sampleValue : samples) {
                sum += sampleValue;
            }
            return sum / samples.length;
        } catch (ArithmeticException exception) {
            return 0;
        }
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[]{2, 4, 6, 8}));
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}