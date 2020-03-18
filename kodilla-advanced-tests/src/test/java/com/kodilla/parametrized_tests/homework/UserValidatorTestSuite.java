package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Kamil15, olaola, mArCin33"})
    public void isUsernameValidate(String username) {
        System.out.println("|" + username + "|");
        boolean user = userValidator.validateUsername(username);
        assertTrue(user);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kamil15@gmail.com, olaola@onet.pl, mArCin33@wp.pl"})
    public void isEmailValidate(String email) {
        boolean mail = userValidator.validateEmail(email);
        assertFalse(mail);
    }
}
