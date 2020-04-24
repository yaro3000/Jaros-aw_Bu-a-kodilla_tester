package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display showResult;

    @Autowired
    public void setDisplay(Display display) {
        this.showResult = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        showResult.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        showResult.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        showResult.display(result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        showResult.display(result);
        return result;
    }
}
