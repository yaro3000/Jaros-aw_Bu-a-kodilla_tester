package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonsBMI {

    private static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of(new Person(1.70,55)),
                Arguments.of(new Person(1.55,80)),
                Arguments.of(new Person(1.75,40)),
                Arguments.of(new Person(1.80,130)),
                Arguments.of(new Person(1.60,92)),
                Arguments.of(new Person(1.64,61)),
                Arguments.of(new Person(1.33,40)),
                Arguments.of(new Person(1.90,88))
        );
    }
}