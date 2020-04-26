package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarManager {

    Random random = new Random();

    @Bean
    public Car randomCar() {
        Car car;
        int season = random.nextInt(4);
        if (season == 0) {
            car = new SUV();
            System.out.println("Przyszła zima, najlepsze auto do wyboru to " + car.getCarType());
        } else if (season == 1) {
            car = new Sedan();
            System.out.println("Przyszła wiosna, najlepsze auto do wyboru to " + car.getCarType());
        } else if (season == 2) {
            car = new Cabrio();
            System.out.println("Przyszło lato, najlepsze auto do wyboru to " + car.getCarType());
        } else {
            car = new Sedan();
            System.out.println("Przyszła jesień, najlepsze auto do wyboru to " + car.getCarType());
        }
        return car;
    }
}
