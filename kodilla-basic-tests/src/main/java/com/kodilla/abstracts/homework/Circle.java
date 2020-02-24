package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    int a = 5;

    @Override
    public void surfaceArea() {
       double circleSurface = 3.14 * a*a;
       System.out.println(circleSurface);
    }

    @Override
    public void circuit() {
       double circleCircuit = 2 * 3.14 * a;
        System.out.println(circleCircuit);
    }
}
