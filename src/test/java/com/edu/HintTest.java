package com.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class HintTest {

    private Hint hint;

    @BeforeEach
    void setUp() {
        hint = new Hint();
    }

    @ParameterizedTest
    @CsvSource(value = {"123:123:3 스트라이크", "453:123:1 스트라이크",
            "132:123:1 스트라이크 2볼", "561:123:1볼", "921:123:1 스트라이크 1볼",
            "378:123:1볼", "231:123:3볼", "479:123:낫싱"}, delimiter = ':')
    void hintTrueTest(String myNumber, String comNumber, String hintInfo) {
        assertThat(hint.giveHintInfo(myNumber, comNumber)).isEqualTo(hintInfo);
    }

    @ParameterizedTest
    @CsvSource(value = {"123a:123", "53:123",
            "aaa:123", "561c:123", "55555:123",
            "0a0:123", "zxcc:123", "34gn:123"}, delimiter = ':')
    void hintFalseTest(String myNumber, String comNumber) {
        String exceptionHint = "";
        assertThat(hint.giveHintInfo(myNumber, comNumber)).isEqualTo(exceptionHint);
    }

    @ParameterizedTest
    @CsvSource(value = {"123:123:3", "453:123:1",
            "132:123:1", "561:123:0", "921:123:1",
            "378:123:0", "231:123:0", "479:123:0"}, delimiter = ':')
    void strikeCountTest(String myNumber, String comNumber, int strikeCount) {
        assertThat(hint.giveStrikeCount(myNumber, comNumber)).isEqualTo(strikeCount);
    }

    @ParameterizedTest
    @CsvSource(value = {"123:123:3:0", "453:123:1:0",
            "132:123:1:2", "561:123:0:1", "921:123:1:1",
            "378:123:0:1", "231:123:0:3", "479:123:0:0"}, delimiter = ':')
    void ballCountTest(String myNumber, String comNumber, int strikeCount,
                       int ballCount) {
        assertThat(hint.giveBallCount(myNumber, comNumber, strikeCount)).
                isEqualTo(ballCount);
    }
}