package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarManagerTestSuite {

    @Test
    public void shouldPickCorrectCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");

        String seasonCar = car.getCarType();
        System.out.println(seasonCar);

        List<String> possibleChoices = Arrays.asList("Sedan", "SUV", "Cabriolet");
        Assertions.assertTrue(possibleChoices.contains(seasonCar));
    }
}
