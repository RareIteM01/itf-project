package com.example.Task20_29;

class TexturePoolTest {
    public static void main(String[] args) {
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}

class TexturePool {
    private static TexturePool instance = null;

    private TexturePool() {
    }

    public static TexturePool getInstance() {
        if (instance == null) {
            instance = new TexturePool();
        }
        return instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}
