package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class HintTest {

    @ParameterizedTest
    @CsvSource(value = {"123:123", "453:123", "132:123", "561:123", "921:123",
            "378:123", "231:123", "379:123"}, delimiter = ':')
    void hintTest(String myNumber, String comNumber) {
        Hint hint = new Hint();
        boolean hintCheck = hint.giveHintInfo(myNumber, comNumber);
        assertThat(hintCheck).isTrue();
    }
}