package com.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class HintTest {

    @ParameterizedTest
    @CsvSource(value = {"378:123:1볼", "378:348:2 스트라이크", "378:148:1 스트라이크", "378:378:3 스트라이크", "378:734:2볼",
            "378:837:3볼", "378:387:1 스트라이크 2볼", "378:125:낫싱"}, delimiter = ':')
    void hintTest(String myNum, String comNum, String expected){

        Hint hint = new Hint();
        String str = hint.hintInfo(comNum,myNum);
        String actual = expected;
        assertThat(str).isEqualTo(actual);

    }
}