package com.example.module4;

public class TrueBank_Task15_16 {
    public static void main(String[] args) {
        TrueBank_Task15_16 trueBank_task15_16 = new TrueBank_Task15_16();
        System.out.println(trueBank_task15_16.sumQuads(50));
        System.out.println(trueBank_task15_16.countSumOfDigits(1058));
    }

    //    Task15
    public int sumQuads(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i * i;
            i++;
        }
        return sum;
    }

    //    Task16
    public int countSumOfDigits(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}