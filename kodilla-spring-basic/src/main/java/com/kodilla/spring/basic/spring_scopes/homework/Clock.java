package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
@Scope("prototype")
public class Clock {

    private ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public Clock() {
        System.out.println(zonedDateTime);
    }
}
