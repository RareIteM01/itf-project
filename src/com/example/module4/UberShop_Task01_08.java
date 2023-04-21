package com.example.module4;

import java.util.Arrays;

public class UberShop_Task01_08 {
    public static void main(String[] args) {
        UberShop_Task01_08 uberShop_task01_08 = new UberShop_Task01_08();
        System.out.println(Arrays.toString(uberShop_task01_08.mergeStocks(new String[]{"1", "2"}, new String[]{"3", "4", "5"})));
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            array[i] += 1000;
        }
        System.out.println(Arrays.toString(array));
    }

    //    Task01
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    //    Task02
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    //    Task03
    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    // Task04
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    //    Task05
    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    //    Task06
    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    //    Task07
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        for (int i = 0; i < showcaseStocks.length; i++) {
            result[i] = showcaseStocks[i];
        }

        for (int i = 0; i < warehouseStocks.length; i++) {
//            2 3
            result[showcaseStocks.length + i] = warehouseStocks[i];
            System.out.println(result[warehouseStocks.length]);
        }

        return result;
    }

    //    Task08
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
        return sum;
    }
}