package com.edu;

public class Compare {

    public void compare(String myNum, String comNum) {

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < myNum.length(); i++) {

            if (comNum.substring(i, i + 1).equals(myNum.substring(i, i + 1))) {
                strike++;
            }

        }

        for (int i = 0; i < myNum.length(); i++) {

            if (comNum.contains(myNum.substring(i, i + 1))) {
                ball++;
            }

        }

        if (ball == 0) {
//            answer = "낫싱";
            System.out.println("낫싱");
        } else if (strike > 0 && strike - ball == 0) {
//            answer = strike + " 스트라이크";
            System.out.println(strike + " 스트라이크");
        } else if (strike > 0 && ball > 0 && strike - ball > 0) {
//            answer = strike + " 스트라이크 " + (strike - ball) + "볼";
            System.out.println(strike + " 스트라이크 " + (strike - ball) + "볼");
        } else if (strike > 0 && ball > 0 && ball - strike > 0) {
//            answer = strike + " 스트라이크 " + (ball - strike) + "볼";
            System.out.println(strike + " 스트라이크 " + (ball - strike) + "볼");
        } else {
//            answer = ball + "볼";
            System.out.println(ball + "볼");
        }

        strike = 0;
        ball = 0;

    }
}
