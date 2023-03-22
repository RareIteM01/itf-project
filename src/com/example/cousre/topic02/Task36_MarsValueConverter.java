package com.example.cousre.topic02;

public class Task36_MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove) {
        float minus = startAmount - toRemove;
        return (int) minus;
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        int sum = sum1 + sum2;
        return (byte) sum;
    }

    public short halfOfMoney(double startMoney) {
        double half = startMoney / 2;
        return (short) half;
    }


}
