package com.edu;

public class Hint {

    public void hintInfo(String myNum, String comNum) {

        int strike = 0;
        int ball = 0;
        int cnt = 0;
        int myNumLength = myNum.length();
        MyNumber myNumber = new MyNumber();

        cnt = myNumber.overlapCheck(myNum,cnt);

        if (cnt < 1) {

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
                System.out.println("낫싱");
            } else if (strike > 0 && strike - ball == 0) {
                System.out.println(strike + " 스트라이크");
            } else if (strike > 0 && ball > 0 && ball - strike > 0) {
                System.out.println(strike + " 스트라이크 " + (ball - strike) + "볼");
            } else {
                System.out.println(ball + "볼");
            }

        }

    }
}
