package com.edu;

public class Hint {

    private static final String STRIKE = " 스트라이크";
    private static final String BALL = "볼";
    private static final String HINT_NONE = "낫싱";
    private static final String ERROR_MESSAGE = "1~9의 숫자를 중복없이 3자리를 입력해주세요.";

    private int strikeCount = 0;
    private int ballCount = 0;

    public boolean giveHintInfo(String myNumber, String comNumber) {
        String hintAnswer = "";
        User user = new User();

        try {
            user.validUserNumber(myNumber);
            strikeCount = 0;
            ballCount = 0;
            strikeCount = giveStrikeCnt(myNumber, comNumber);
            ballCount = giveBallCnt(myNumber, comNumber);
            ballCount = ballCount - strikeCount;

            if (ballCount == 0 && strikeCount == 0) {
                hintAnswer = HINT_NONE;
                System.out.println(hintAnswer);
                return true;
            }

            if (strikeCount > 0 && ballCount == 0) {
                hintAnswer = strikeCount + STRIKE;
                System.out.println(hintAnswer);
                return true;
            }

            if (strikeCount > 0 && ballCount > 0) {
                hintAnswer = strikeCount + STRIKE + " " + ballCount + BALL;
                System.out.println(hintAnswer);
                return true;
            }

            if (ballCount > 0 && strikeCount == 0) {
                hintAnswer = ballCount + BALL;
                System.out.println(hintAnswer);
                return true;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public int giveStrikeCnt(String myNumber, String comNumber) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.charAt(i) == myNumber.charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int giveBallCnt(String myNumber, String comNumber) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.contains(myNumber.substring(i, i + 1))) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
