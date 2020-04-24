package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldCorrectDisplay() {
        Display bean = context.getBean(Display.class);
        double number = bean.display(22.12);
        Assertions.assertNotNull(number);
    }

    @Test
    public void shouldCorrectAdd() {
        Calculator bean = context.getBean(Calculator.class);
        double number = bean.add(7, 3);
        Assertions.assertEquals(10, number);
    }
}