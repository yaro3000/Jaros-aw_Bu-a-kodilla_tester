package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Opel opel = new Opel(50);
        doRace(opel);

        Ferrari ferrari = new Ferrari(50);
        doRace(ferrari);

        Dodge dodge = new Dodge(50);
        doRace(dodge);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
