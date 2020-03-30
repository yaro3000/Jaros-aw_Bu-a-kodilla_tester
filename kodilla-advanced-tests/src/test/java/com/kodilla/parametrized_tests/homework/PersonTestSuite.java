package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTestSuite {

    Person person = new Person();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonsBMI#personList")
    public void shouldCalculatePersonBMI(double input, String expected) {

    }
}
