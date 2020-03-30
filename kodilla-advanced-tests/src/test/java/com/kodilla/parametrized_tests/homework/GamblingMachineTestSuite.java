package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 0)
    public void isNumberOfWindsCorrect(String number) throws InvalidNumbersException {

        String[] splitedString = number.split(" ");

        Set<Integer> validSets = new HashSet<>();

        for (String number1 : splitedString) {
            validSets.add(Integer.parseInt(number1));
        }

        int counted = gamblingMachine.howManyWins(validSets);
        boolean result = counted > 0 && counted < 6;
        assertTrue(result);
    }
}
