package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest<ExpectedException> {
    User user = new User();

    @ParameterizedTest
    @ValueSource(strings = {"123", "486", "387", "267", "954", "527"})
    void validTrueTest(String myNumber) throws Exception {
        boolean validation = user.validUserNumber(myNumber);
        assertThat(validation).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"111", "2345", "abc", "1a2", "aaa4", ""})
    void validFalseTest(String myNumber) {
        Throwable exception = assertThrows(
                Exception.class,
                () -> {
                    throw new Exception("Exception message");
                }
        );
        try {
            assertEquals(user.validUserNumber(myNumber), "Exception message");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}