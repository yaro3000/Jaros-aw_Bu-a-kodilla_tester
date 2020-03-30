package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonsBMI {

    private static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of(new Person(1.70, 55), "Normal (healthy weight)"),
                Arguments.of(new Person(1.55, 80), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.75, 40), "Very severely underweight"),
                Arguments.of(new Person(1.80, 130), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.60, 92), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.64, 61), "Normal (healthy weight)"),
                Arguments.of(new Person(1.33, 40), "Normal (healthy weight)"),
                Arguments.of(new Person(1.90, 88), "Normal (healthy weight)")
        );
    }
}