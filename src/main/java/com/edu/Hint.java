package com.edu;

public class Hint {

    public static final String ERROR_MESSAGE = "1~9의 숫자를 중복없이 3자리를 입력해주세요.";

    private String hintInfo = "";

    public String giveHintInfo(String userNumber, String comNumber) {
        User user = new User();

        try {
            user.checkValidUserNumber(userNumber);
            hintInfo = giveTrueHint(userNumber, comNumber);
            return hintInfo;

        } catch (IllegalArgumentException e) {
            System.out.print(ERROR_MESSAGE);
            return "";
        }
    }

    public String giveTrueHint(String userNumber, String comNumber) {
        int strikeCount = giveStrikeCount(userNumber, comNumber);
        int ballCount = giveBallCount(userNumber, comNumber, strikeCount);

        if (ballCount == 0 && strikeCount == 0) {
            hintInfo = BallType.HINT_NONE.description;
            return hintInfo;
        }

        if (strikeCount > 0 && ballCount == 0) {
            hintInfo = strikeCount + BallType.STRIKIE.description;
            return hintInfo;
        }

        if (strikeCount > 0 && ballCount > 0) {
            hintInfo = strikeCount + BallType.STRIKIE.description +
                    ballCount + BallType.BALL.description;
            return hintInfo;
        }

        if (ballCount > 0 && strikeCount == 0) {
            hintInfo = ballCount + BallType.BALL.description;
            return hintInfo;
        }

        return hintInfo;
    }

    public int giveStrikeCount(String userNumber, String comNumber) {
        int myNumberLength = userNumber.length();
        int strikeCount = 0;

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.charAt(i) == userNumber.charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int giveBallCount(String userNumber, String comNumber, int strikeCount) {
        int myNumberLength = userNumber.length();
        int ballCount = 0;

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.contains(userNumber.substring(i, i + 1))) {
                ballCount++;
            }
        }
        return (ballCount - strikeCount);
    }

    public enum BallType {
        STRIKIE(" 스트라이크 "),
        BALL("볼"),
        HINT_NONE("낫싱"),
        ;

        private final String description;

        BallType(String description) {
            this.description = description;
        }
    }
}
