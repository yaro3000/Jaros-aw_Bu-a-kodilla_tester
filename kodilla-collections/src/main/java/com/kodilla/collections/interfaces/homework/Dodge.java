package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Dodge implements Car {

    int speedValue;

    public Dodge(int speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public String toString() {
        return "Dodge{" +
                "speedValue=" + speedValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dodge dodge = (Dodge) o;
        return speedValue == dodge.speedValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedValue);
    }

    @Override
    public int getSpeed() {
        return speedValue;
    }

    @Override
    public void increaseSpeed() {
        speedValue = speedValue + (speedValue / 2);
    }

    @Override
    public void decreaseSpeed() {
        speedValue = speedValue - (speedValue / 3);
    }
}
