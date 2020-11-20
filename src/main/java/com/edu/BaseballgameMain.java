package com.edu;

import java.util.Scanner;

public class BaseballgameMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int comNum = 0;
        String comNumStr = "";
        String myNum = "";

        Hint hint = new Hint();
        ComNumber comnumCreate = new ComNumber();
        Restart restart = new Restart();

        comNumStr = comnumCreate.comNumCreate();
        System.out.println(comNumStr);

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            myNum = scan.next();

            if (myNum.equals(comNumStr)) {
                System.out.println("3 스트라이크\n3개의숫자를모두맞히셨습니다! " +
                        "게임종료\n게임을새로시작하려면 1,종료하려면 2를입력하세요.");

                myNum = scan.next();
                restart.select(myNum);

                comNumStr = comnumCreate.comNumCreate();
                System.out.println(comNumStr);
            } else {
                hint.hintInfo(myNum,comNumStr);
            }
        }

    }

}
