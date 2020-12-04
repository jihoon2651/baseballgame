package com.edu;

public class Hint {

    private static final String STRIKE = " 스트라이크";
    private static final String BALL = "볼";
    private static final String HINT_NONE = "낫싱";
    private static final String ERROR_MESSAGE = "1~9의 숫자를 중복없이 3자리를 입력해주세요.";

    private int strikeCount = 0;
    private int ballCount = 0;
    private String hintInfo = "";

    public String giveHintInfo(String myNumber, String comNumber) {
        User user = new User();

        try {
            user.validUserNumber(myNumber);
            hintInfo = giveTrueHint(myNumber, comNumber);
            return hintInfo;

        } catch (IllegalArgumentException e) {
            System.out.print(ERROR_MESSAGE);
            return "";
        }
    }

    public String giveTrueHint(String myNumber, String comNumber) {
        strikeCount = 0;
        ballCount = 0;
        strikeCount = giveStrikeCount(myNumber, comNumber);
        ballCount = giveBallCount(myNumber, comNumber, strikeCount);

        if (ballCount == 0 && strikeCount == 0) {
            hintInfo = HINT_NONE;
            return hintInfo;
        }

        if (strikeCount > 0 && ballCount == 0) {
            hintInfo = strikeCount + STRIKE;
            return hintInfo;
        }

        if (strikeCount > 0 && ballCount > 0) {
            hintInfo = strikeCount + STRIKE + " " + ballCount + BALL;
            return hintInfo;
        }

        if (ballCount > 0 && strikeCount == 0) {
            hintInfo = ballCount + BALL;
            return hintInfo;
        }

        return hintInfo;
    }

    public int giveStrikeCount(String myNumber, String comNumber) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.charAt(i) == myNumber.charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int giveBallCount(String myNumber, String comNumber, int strikeCount) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.contains(myNumber.substring(i, i + 1))) {
                ballCount++;
            }
        }
        return (ballCount - strikeCount);
    }
}
