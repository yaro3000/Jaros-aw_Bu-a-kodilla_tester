package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystems {
    @Override
    public void turnOn() {
        System.out.println("Windows is turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Windows is turn off");
    }

    public Windows(int year) {
        super(year);
    }
}
