package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ferrari implements Car {

    int speedValue;

    public Ferrari(int speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "speedValue=" + speedValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferrari ferrari = (Ferrari) o;
        return speedValue == ferrari.speedValue;
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
        speedValue = speedValue + speedValue;
    }

    @Override
    public void decreaseSpeed() {
        speedValue = speedValue - (speedValue / 2);
    }
}
