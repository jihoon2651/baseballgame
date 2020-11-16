package com.edu;

import java.util.Scanner;

public class BaseballgameVer2 {

    static int comN = 0;
    static String comNum = "";
    static String myNum = "";
    static int strike = 0;
    static int ball = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Compare compare = new Compare();
        ComnumCreate comnumCreate = new ComnumCreate();
        Restart restart = new Restart();

        comNumCreate();

        System.out.println(comNum);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        while (true) {
            strike = 0;
            ball = 0;
            System.out.print("숫자를 입력해주세요 : ");
            myNum = scan.next();

            if (myNum.equals(comNum)) {
                System.out.println("3 스트라이크\n3개의숫자를모두맞히셨습니다! 게임종료\n"
                        + "게임을새로시작하려면 1,종료하려면 2를입력하세요.");

                myNum = scan.next();
                startEnd(myNum);

            } else {

                strike(myNum, comNum);
//                ball(myNum, comNum);

            }
        }

    }

    static public void comNumCreate() {

        for (int i = 0; i < 3; i++) {
            comN = (int) (Math.random() * 9) + 1;

            if (!comNum.contains(Integer.toString(comN))) {
                comNum += Integer.toString(comN);
            } else {
                i--;
            }

        }

    }

    static public void startEnd(String myNum) {

        if (myNum.equals("1")) {
            comNum = "";
            comNumCreate();
            System.out.println(comNum);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        } else if (myNum.equals("2")) {
            System.out.println("종료되었습니다.");
            System.exit(0);
        }

    }

    static public void strike(String myNum, String comNum) {

        for (int i = 0; i < myNum.length(); i++) {

            if (comNum.substring(i, i + 1).equals(myNum.substring(i, i + 1))) {
                strike++;
            }

        }

        ball(myNum, comNum);

    }

    static public void ball(String myNum, String comNum) {

        for (int i = 0; i < myNum.length(); i++) {

            if (comNum.contains(myNum.substring(i, i + 1))) {
                ball++;
            }

        }
        compare(strike, ball);
    }

    static public void compare(int strike, int ball) {

        if (ball == 0) {
            System.out.println("낫싱");
        } else if (strike > 0 && strike - ball == 0) {
            System.out.println(strike + " 스트라이크");
        } else {
            compare2(strike, ball);
        }

    }

    static public void compare2(int strike, int ball) {

        if (strike > 0 && ball > 0 && strike - ball > 0) {
            System.out.println(strike + " 스트라이크 " + (strike - ball) + "볼");
        } else if (strike > 0 && ball > 0 && ball - strike > 0) {
            System.out.println(strike + " 스트라이크 " + (ball - strike) + "볼");
        } else {
            System.out.println(ball + "볼");
        }

    }

}
