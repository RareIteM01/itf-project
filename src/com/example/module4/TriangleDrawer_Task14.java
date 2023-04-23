package com.example.module4;

public class TriangleDrawer_Task14 {
    public String drawTriangle(int side) {
        String triangle = "";
        int row = side;
        while (row > 0) {
            int col = 0;
            while (col < row) {
                triangle += "*";
                col++;
            }
            triangle += "\n";
            row--;
        }
        return triangle.trim();
    }
}

