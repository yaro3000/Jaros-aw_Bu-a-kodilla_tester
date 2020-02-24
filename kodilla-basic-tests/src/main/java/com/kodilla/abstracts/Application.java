package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.getVoice();

        Duck duck = new Duck();
        duck.getVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
