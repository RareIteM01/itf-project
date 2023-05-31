package com.example.module05.phone;

import java.util.Random;

class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " ball with number " + number;
    }
}

enum Color {
    RED, GOLD, BLUE, GREEN, YELLOW, ORANGE, BROWN, SILVER;
}

class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}

class Lottery {
    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        System.out.println("Ball 1: " + ball1);
        System.out.println("Ball 2: " + ball2);
        System.out.println("Ball 3: " + ball3);
    }
}
