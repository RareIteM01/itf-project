package com.example.Task20_29;

class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
        menu.act(new GameMenu.Options());
        menu.act(new GameMenu.Start());
        menu.act(new GameMenu.Exit());
    }
}

class GameMenu {
    void act(MenuItem item) {
        System.out.println(item.getAction());
    }

    abstract static class MenuItem {
        abstract String getAction();
    }

    public static class Start extends MenuItem {
        @Override
        String getAction() {
            return "start";
        }
    }

    public static class Options extends MenuItem {
        @Override
        String getAction() {
            return "options";
        }
    }

    public static class Exit extends MenuItem {
        @Override
        String getAction() {
            return "exit";
        }
    }
}