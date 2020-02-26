package com.kodilla.collections.interfaces.homework;

public class Dodge implements Car {

    int speedValue;

    public Dodge(int speedValue) {
        this.speedValue = speedValue;
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
