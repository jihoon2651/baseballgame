package com.edu;

import java.util.Scanner;

public class BaseballgameMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int comN = 0;
        String comNum = "";
        String myNum = "";

        Compare compare = new Compare();
        ComnumCreate comnumCreate = new ComnumCreate();
        Restart restart = new Restart();

        comNum = comnumCreate.comNumCreate(comN, comNum);

        System.out.println(comNum);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            myNum = scan.next();

            if (myNum.equals(comNum)) {
                System.out.println("3 스트라이크\n3개의숫자를모두맞히셨습니다! 게임종료\n"
                        + "게임을새로시작하려면 1,종료하려면 2를입력하세요.");

                myNum = scan.next();
                comNum = restart.restart(myNum,comNum,comN);

            } else {

                compare.compare(myNum, comNum);

            }
        }

    }

}
