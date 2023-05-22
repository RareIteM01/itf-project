package com.example.task1_9;

class GameSaver {
    static {
        System.out.println("GameSaver created!");
    }
}

class GameSaverTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}