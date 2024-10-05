package org.example.Birds;

public class Drozd extends Bird implements Singable{
    public Drozd() {
        super("brown");
    }

    @Override
    public void fly() {
        System.out.println("Drozd can fly :)");
    }

    @Override
    public void sing() {
        System.out.println("Drozd can sing :)");
    }
}
