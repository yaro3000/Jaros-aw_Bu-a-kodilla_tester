package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {

    int speedValue;

    public Opel(int speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speedValue=" + speedValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speedValue == opel.speedValue;
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
        speedValue = speedValue + (speedValue / 3);
    }

    @Override
    public void decreaseSpeed() {
        speedValue = speedValue - (speedValue / 4);
    }
}
