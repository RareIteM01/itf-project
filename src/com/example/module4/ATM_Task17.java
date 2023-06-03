package com.example.module4;

public class ATM_Task17 {
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int index = 0;
        while (sum > 0) {
            count += sum / banknotes[index];
            sum %= banknotes[index];
            index++;
        }
        return count;
    }
}
