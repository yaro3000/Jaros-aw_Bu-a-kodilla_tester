package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    int speedValue;

    public Opel(int speedValue) {
        this.speedValue = speedValue;
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
