package com.edu;

public class Hint {

    private static final String STRIKE = " 스트라이크";
    private static final String BALL = "볼";
    private static final String HINT_NONE = "낫싱";
    private static final String ERROR_MESSAGE = "1~9숫자를 중복없이 3자리를 입력해주세요.";

    static int strikeCnt = 0;
    static int ballCnt = 0;

    public boolean giveHintInfo(String myNumber, String comNumber) throws Exception {
        String hintAnswer = "";
        User user = new User();

        try {
            user.validUserNumber(myNumber);
            strikeCnt = 0;
            ballCnt = 0;
            strikeCnt = giveStrikeCnt(myNumber, comNumber);
            ballCnt = giveBallCnt(myNumber, comNumber);
            ballCnt = ballCnt - strikeCnt;

            if (ballCnt == 0 && strikeCnt == 0) {
                hintAnswer = HINT_NONE;
                System.out.println(hintAnswer);
                return true;
            }

            if (strikeCnt > 0 && ballCnt == 0) {
                hintAnswer = strikeCnt + STRIKE;
                System.out.println(hintAnswer);
                return true;
            }

            if (strikeCnt > 0 && ballCnt > 0) {
                hintAnswer = strikeCnt + STRIKE + " " + ballCnt + BALL;
                System.out.println(hintAnswer);
                return true;
            }

            if (ballCnt > 0 && strikeCnt == 0) {
                hintAnswer = ballCnt + BALL;
                System.out.println(hintAnswer);
                return true;
            }

        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public int giveStrikeCnt(String myNumber, String comNumber) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.charAt(i) == myNumber.charAt(i)) {
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    public int giveBallCnt(String myNumber, String comNumber) {
        int myNumberLength = myNumber.length();

        for (int i = 0; i < myNumberLength; i++) {
            if (comNumber.contains(myNumber.substring(i, i + 1))) {
                ballCnt++;
            }
        }
        return ballCnt;
    }
}
