package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Dodge;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Opel;


public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("----------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car increase speed: " + car.getSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Dodge)
            return "Dodge";
        else if (car instanceof Ferrari)
            return "Ferrari";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car model";
    }
}
