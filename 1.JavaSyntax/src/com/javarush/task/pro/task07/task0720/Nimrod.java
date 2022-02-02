package com.javarush.task.pro.task07.task0720;

public class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;
    public int health = 1000000;

    public int attack() {
        return angelicaKiss;
    }

    public void defend(int b) {
        health = health - applyShield(b);
        applyShield(b);

    }

    public byte applyShield(int a) {
        return (byte) a;
    }
}
