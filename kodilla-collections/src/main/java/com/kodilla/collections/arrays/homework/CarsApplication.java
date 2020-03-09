package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dodge;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    static Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        int drawCarKind = random.nextInt(3);
        int a = random.nextInt(50) + 20;
        if (drawCarKind == 0)
            return new Dodge(a);
        else if (drawCarKind == 1)
            return new Ferrari(a);
        else
            return new Opel(a);
    }
}
