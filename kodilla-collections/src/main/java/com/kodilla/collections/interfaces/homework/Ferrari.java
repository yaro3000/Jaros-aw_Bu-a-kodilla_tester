package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {

    int speedValue;

    public Ferrari(int speedValue) {
        this.speedValue = speedValue;
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
