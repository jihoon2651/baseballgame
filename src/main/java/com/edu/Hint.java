package com.edu;

public class Hint {

    public String hintInfo(String myNum, String comNum) {

        int strike = 0;
        int ball = 0;
        int validationCnt = 0;
        int myNumLength = myNum.length();
        String hintAnswer = "";
        MyNumber myNumber = new MyNumber();

        validationCnt = myNumber.validation(myNum,validationCnt);

        if (validationCnt < 1) {

            for (int i = 0; i < myNumLength; i++) {
                if (comNum.charAt(i) == myNum.charAt(i)) {
                    strike++;
                }
            }

            for (int i = 0; i < myNumLength; i++) {
                if (comNum.contains(myNum.substring(i, i + 1))) {
                    ball++;
                }
            }

            if (ball == 0) {
                hintAnswer = "낫싱";
            } else if (strike > 0 && strike - ball == 0) {
                hintAnswer = strike + " 스트라이크";
            } else if (strike > 0 && ball > 0 && ball - strike > 0) {
                hintAnswer = strike + " 스트라이크 " + (ball - strike) + "볼";
            } else {
                hintAnswer = ball + "볼";
            }

        }

        return hintAnswer;

    }
}
