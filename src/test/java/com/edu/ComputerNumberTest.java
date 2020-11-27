package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ComputerNumberTest {
    User user = new User();

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789", "678", "146", "964"})
    void comNumberTrueTest(String testNumber) throws Exception {
        boolean trueTest = user.validUserNumber(testNumber);
        assertThat(trueTest).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1231", "56", "9", "abc", "a12", "ㅂㅁㅋ"})
    void comNumberFalseTest(String testNumber) throws Exception {
        Throwable exception = assertThrows(
                Exception.class,
                () -> {
                    throw new Exception("Exception message");
                }
        );
        try {
            boolean falseTest = user.validUserNumber(testNumber);
            assertThat(falseTest).isFalse();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}