package org.example;

import org.example.Birds.*;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird() {
            @Override
            public void fly() {

            }
        };

        Bird bird1 = new Bird("yellow") {
            @Override
            public void fly() {

            }
        };

        Drozd drozd = new Drozd();

        Penguin penguin = new Penguin();

        Kanarejka kanarejka = new Kanarejka();

        Straus straus = new Straus();

        System.out.println(bird.equals(straus));

        System.out.println(bird.hashCode());
        System.out.println(straus.hashCode());
    }
}