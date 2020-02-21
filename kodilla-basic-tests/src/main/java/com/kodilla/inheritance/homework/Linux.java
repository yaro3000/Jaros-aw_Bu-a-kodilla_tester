package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystems {
    @Override
    public void turnOn() {
        System.out.println("Linux is turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Linux is turn off");
    }
    public Linux(int year) {
        super(year);
    }
}
