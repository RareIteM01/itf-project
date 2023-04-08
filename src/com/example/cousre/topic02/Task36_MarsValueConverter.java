package com.example.cousre.topic02;

public class Task36_MarsValueConverter {

    public static void main(String[] args) {
        Task36_MarsValueConverter task36 = new Task36_MarsValueConverter();
        System.out.println(task36.calculateMoneySum(257, 1));
        System.out.println(task36.changeMoneyAmount(12.4f, 345.44f));
        System.out.println(task36.halfOfMoney(86.8934));
    }

    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }
}
