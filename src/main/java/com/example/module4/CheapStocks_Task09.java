package com.example.module4;

public class CheapStocks_Task09 {
    public static final String SEPARATOR = " ";
    public static final int CHEAP_PRICE = 200;
    public static final int PRICE_INDEX = 1;
    public static final int NAME_INDEX = 0;

    public static void main(String[] args) {
        CheapStocks_Task09 cheapStocks_task09 = new CheapStocks_Task09();
        System.out.println(cheapStocks_task09.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 199"}));
    }

    public String getCheapStocks(String[] stocks) {
        String cheapStocks = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] stockTokens = stocks[i].split(SEPARATOR);
            if (Integer.parseInt(stockTokens[PRICE_INDEX]) < CHEAP_PRICE) {
                cheapStocks = cheapStocks + stockTokens[NAME_INDEX] + SEPARATOR;
            }
        }
        return cheapStocks;
    }
}