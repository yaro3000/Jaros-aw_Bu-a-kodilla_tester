package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockTestSuite {

    @Test
    public void shouldShowCorrectTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock = context.getBean(Clock.class);
        Clock clock1 = context.getBean(Clock.class);
        Assertions.assertNotEquals(clock, clock1);
    }
}
