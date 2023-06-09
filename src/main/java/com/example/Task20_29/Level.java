package com.example.Task20_29;

class Level {
    private int width;
    private int height;
    private int s;

    public int getS() {
        return s;
    }

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        this.s = this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}


class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        int s = level.getS();
        if (s < 10000) {
            System.out.println("Level loaded");
        } else {
            throw new LevelTooBigException();
        }

    }

}

class LevelTooBigException extends Exception {
    public String load(Level level) {
        return getMessage();
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
