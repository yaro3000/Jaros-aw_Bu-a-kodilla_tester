package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystems operatingSystems = new OperatingSystems(1981);
        operatingSystems.turnOn();
        operatingSystems.publicationYear();

        Windows windows = new Windows(1985);
        windows.turnOff();
        windows.publicationYear();

        Linux linux = new Linux(1991);
        linux.turnOn();
        linux.publicationYear();
    }
}
