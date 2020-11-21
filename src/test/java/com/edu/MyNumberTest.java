package com.edu;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

class MyNumberTest {

    MyNumber myNumber = new MyNumber();
    int validationCnt = 0;

    @ParameterizedTest
    @ValueSource(strings = {"123", "486", "387", "267", "954", "527"})
    void myNumTrueValidation(String myNum) {

        validationCnt = myNumber.validation(myNum, validationCnt);
        assertThat(validationCnt <= 0).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1283", "113", "4569", "533", "484"})
    void myNumFalseValidation(String myNum) {

        validationCnt = myNumber.validation(myNum, validationCnt);
        assertThat(validationCnt > 0).isTrue();
    }


}