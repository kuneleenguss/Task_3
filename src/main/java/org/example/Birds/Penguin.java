package org.example.Birds;

public class Penguin extends Bird implements Walkable{
    public Penguin() {
        super("black");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly :(");
    }

    @Override
    public void walk() {
        System.out.println("Penguin can walk :)");
    }
}
