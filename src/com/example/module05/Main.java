package com.example.module05;

abstract class Animal {
    public abstract void say();

    public abstract void canFly();

    public abstract void canSwim();
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("Meow");
    }

    @Override
    public void canFly() {
        System.out.println("Can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Can't swim");
    }
}

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("Woof");
    }

    @Override
    public void canFly() {
        System.out.println("Can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Can't swim");
    }
}

class Fish extends Animal {
    @Override
    public void say() {
        System.out.println("...");
    }

    @Override
    public void canFly() {
        System.out.println("Can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Can swim");
    }
}

class Bird extends Animal {
    @Override
    public void say() {
        System.out.println("Tweet");
    }

    @Override
    public void canFly() {
        System.out.println("Can fly");
    }

    @Override
    public void canSwim() {
        System.out.println("Can't swim");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Fish(), new Bird()};

        for (Animal animal : animals) {
            animal.say();
            animal.canFly();
            animal.canSwim();
            System.out.println();
        }
    }
}
