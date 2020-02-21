package com.kodilla.inheritance.homework;

public class OperatingSystems {
    private int year;

    public OperatingSystems(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void publicationYear() {
        System.out.println("Rok wydania " + year);
    }
    public void turnOn() {
        System.out.println("System is turn on");
    }
    public void turnOff() {
        System.out.println("System is turn off");
    }
}
