package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squaResult = (int) calculator.squared(a);
        boolean correctSqua = ResultChecker.assertEquals(25,squaResult);
        if(correctSqua) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
        }
    }
}
