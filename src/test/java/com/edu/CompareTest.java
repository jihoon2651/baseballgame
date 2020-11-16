package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @ParameterizedTest
    @CsvSource(value = {"378:123:1 볼", "378:348:2 스트라이크", "378:148:1 스트라이크", "378:378:3 스트라이크", "378:734:2 볼",
            "378:837:3 볼", "378:387:1 스트라이크 2 볼"}, delimiter = ':')
    void test(String answer, String input, String expected){

        Compare compare = new Compare();
        compare.compare(answer,input);
        String actual = expected;
        assertThat(actual).isEqualTo(expected);


    }
}