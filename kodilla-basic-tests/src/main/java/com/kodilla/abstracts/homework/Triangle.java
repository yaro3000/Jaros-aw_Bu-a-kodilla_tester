package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    int a = 6;
    int b = 6;
    int c = 8;
    int h = 5;

    @Override
    public void surfaceArea() {
        double triangleSurface = c / 2 * h;
        System.out.println(triangleSurface);
    }

    @Override
    public void circuit() {
        int triangleCircuit = a + b + c;
        System.out.println(triangleCircuit);
    }
}
