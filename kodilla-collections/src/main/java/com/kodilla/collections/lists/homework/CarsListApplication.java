package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dodge;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(45);
        cars.add(opel);
        cars.add(new Opel(50));
        cars.add(new Ferrari(80));
        cars.add(new Dodge(65));
        cars.add(new Ferrari(85));

        cars.remove(2);
        cars.remove(opel);
        System.out.println("Array size: " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
