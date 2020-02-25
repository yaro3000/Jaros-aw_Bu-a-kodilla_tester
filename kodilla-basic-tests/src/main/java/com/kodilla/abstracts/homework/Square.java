package com.kodilla.abstracts.homework;

public class Square extends Shape {

    int a = 4;

    @Override
    public void surfaceArea() {
        int squareSurface = a ^ 2;
        System.out.println(squareSurface);
    }

    @Override
    public void circuit() {
        int squareCircuit = a + a + a + a;
        System.out.println(squareCircuit);
    }
}
