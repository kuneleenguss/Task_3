package org.example.Birds;

public class Straus extends Bird implements Walkable{

    @Override
    public void fly() {
        System.out.println("Straus can't fly :(");
    }

    @Override
    public void walk() {
        System.out.println("Straus can walk :)");
    }
}
