package org.example.Birds;

import java.util.Objects;

public abstract class Bird extends Animal implements Flyable {
    protected Object feather;

    public Object getFeather() {
        return feather;
    }

    public String getColor() {
        return color;
    }

    protected String color;

    public Bird(String color) {
        this.color = color;
    }

    public Bird() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        return Objects.equals(getColor(), bird.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }
}
