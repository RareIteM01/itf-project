package com.example.module03;

public class CreateArray_Task06_8 {
    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        String first = names[0];
        String last = names[names.length - 1];
        return first + " AND " + last + " TOGETHER";
    }
}
