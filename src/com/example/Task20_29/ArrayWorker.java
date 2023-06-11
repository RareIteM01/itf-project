package com.example.Task20_29;

class ArrayWorker {
    public void printElement(int[] array, int index) {
        try {
            int value = array[index];
            System.out.println("value is " + value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }
}

class ArrayWorkerTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        new ArrayWorker().printElement(array, 0);
        new ArrayWorker().printElement(array, 10);
    }
}