package com.example.task10_19;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int x1, y1, x2, y2;

    public RectangleArea(int[] coords) {
        this.x1 = coords[0];
        this.y1 = coords[1];
        this.x2 = coords[2];
        this.y2 = coords[3];
    }

    public int getArea() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        return width * height;
    }
}
