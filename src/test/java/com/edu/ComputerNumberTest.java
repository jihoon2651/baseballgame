package com.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class ComputerNumberTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789", "678", "146", "964"})
    void comNumberTrueTest(String testNumber) {
        assertThatCode(() -> {
            user.validUserNumber(testNumber);
        }).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1213", "56", "9", "abc", "a12", "ㅂㅁㅋ"})
    void comNumberFalseTest(String testNumber) {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> user.validUserNumber(testNumber)
        );
    }

}