package org.example.Birds;

public class Kanarejka extends Bird implements Singable{
    public Kanarejka() {
        super("yellow");
    }

    @Override
    public void fly() {
        System.out.println("Kanarejka can fly :)");
    }

    @Override
    public void sing() {
        System.out.println("Kanarejka can sing :)");
    }
}
