package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    User user = new User();

    @ParameterizedTest
    @ValueSource(strings = {"123", "486", "387", "267", "954", "527"})
    void validTrueTest(String myNumber) throws Exception {
        boolean validation = user.validUserNumber(myNumber);
        assertThat(validation).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1233", "2345", "abc", "1a2", "aaa4", ""})
    void validFalseTest(String myNumber) {

        try {
            boolean validation = user.validUserNumber(myNumber);
            assertThat(validation).isFalse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}