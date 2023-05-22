package com.example.task1_9;

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = (hp >= 0 && hp <= 200) ? hp : (hp < 0 ? 0 : 200);
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);
        System.out.println(hero.getName());
        System.out.println(hero.getHp());
    }
}