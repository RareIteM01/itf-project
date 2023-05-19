package com.example.module05.oop_start.matrixDiagonal;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        MatrixDiagonal matrixDiagonal = new MatrixDiagonal();
        System.out.println(Arrays.toString(matrixDiagonal.getDiagonal(new int[][]{{0, 1, 2}, {4, 5, 6}, {1, 1, 1}})));
        System.out.println(Arrays.toString(matrixDiagonal.getCounterDiagonal(new int[][]{{0, 1, 2}, {4, 5, 6}, {1, 1, 1}})));
    }
}

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonalResult = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonalResult[i] = matrix[i][j];
                }
            }
        }
        return diagonalResult;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterResult = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix[i][j] == matrix[i][matrix[i].length - 1 - i]) {
                    counterResult[i] = matrix[i][j];
                }
            }
        }
        return counterResult;
    }
}