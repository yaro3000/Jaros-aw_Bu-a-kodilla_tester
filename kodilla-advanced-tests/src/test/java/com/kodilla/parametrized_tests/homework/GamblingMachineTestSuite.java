package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1)
    public void isNumberOfWindsCorrect(int number) throws InvalidNumbersException {
        System.out.println(number);
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number);
        assertEquals(numbers, gamblingMachine.howManyWins(numbers));
    }
}
