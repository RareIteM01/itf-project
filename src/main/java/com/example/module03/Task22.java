package com.example.module03;

public class Task22 {
    public String getMyPrizes(int ticket) {
        String wonPrize = "";
        if (ticket % 10 == 0) {
            wonPrize += "crystall ";
        }
        if (ticket % 10 == 7) {
            wonPrize += "chip ";
        }
        if (ticket > 200) {
            wonPrize += "coin ";
        }
        return wonPrize.trim();
    }
}