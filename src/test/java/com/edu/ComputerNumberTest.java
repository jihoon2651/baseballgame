package com.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerNumberTest {

    private ComputerNumber computerNumber;

    @BeforeEach
    void setUp() {
        computerNumber = new ComputerNumber();
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789", "678", "146", "964"})
    void comNumberTrueTest(String computerNumberTest) {
        assertThat(computerNumber.checkComNumber(computerNumberTest)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1-", "78]", "bv@", "abc", "a12", "ㅂㅁㅋ"})
    void comNumberFalseTest(String computerNumberTest) {
        assertThat(computerNumber.checkComNumber(computerNumberTest)).isFalse();
    }

}