package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Kamil15", "olaola", "DamiAAn1333"})
    public void isUsernameValidate(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC", "Xyz", "123", "._-abc"})
    public void ShouldReturnTrueWhenTheUserNameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@a.com", "A@A.org", "1@1.io", "_-@-.de", "a-a@a-a.com", "1.1@1.1.io"})
    public void isEmailValidate(String email) {
        System.out.println("|" + email + "|");
        boolean mail = userValidator.validateEmail(email);
        System.out.println(mail);
        assertTrue(mail);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@a.com", "A@A.org", "1@1.io", "_-@-.de", "a-a@a-a.com", "1.1@1.1.io"})
    public void ShouldReturnTrueWhenTheEmailIsOk(String value) {
        assertTrue(userValidator.validateEmail(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", " ", "a.com", "a@a", "!@aa.io", "aa@%.com"})
    public void ShouldReturnFalseWhenTheEmailIsNotOk(String value) {
        assertFalse(userValidator.validateEmail(value));
    }
}
