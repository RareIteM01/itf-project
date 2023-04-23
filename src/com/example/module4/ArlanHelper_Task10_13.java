package com.example.module4;

public class ArlanHelper_Task10_13 {
    //    Task10
    public String drawQuad(int n) {
        String result = "";
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                result += "*";
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    //    Task11
    public String drawRect(int width, int height, char c) {
        String result = "";
        int h = 0;
        while (h < height) {
            h++;
            int w = 0;
            while (w < width) {
                w++;
                result += c;
            }
            result += "\n";
        }
        return result;
    }

    //    Task12
    public String drawLine(int length) {
        String result = "";
        int index = 0;
        while (index < length) {
            index++;
            if (index % 2 == 0) {
                result += "#";
            } else {
                result += "*";
            }
        }
        return result;
    }

    //    Task13
    public String drawPattern(char[] pattern, int repeatCount) {
        String word = "";
        int index = 0;
        while (index < pattern.length) {
            word += pattern[index];
            index++;
        }

        int repeat = 0;
        String result = "";
        while (repeat < repeatCount) {
            result += word;
            repeat++;
        }
        return result;
    }
}