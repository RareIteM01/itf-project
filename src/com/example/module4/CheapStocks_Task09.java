package com.example.module4;

public class CheapStocks_Task09 {
    public String getCheapStocks(String[] stocks) {
        String cheapStocks = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] stock = stocks[i].split(" ");
            if (Integer.parseInt(stock[1]) < 200) {
                if (!cheapStocks.isEmpty()) {
                    cheapStocks += " ";
                }
                cheapStocks += stock[0];
            }
        }
        return cheapStocks;
    }
}