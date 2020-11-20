package com.edu;

import java.util.Scanner;

public class Restart {

    public void select(String myNum) {

        Scanner scan = new Scanner(System.in);

        if (myNum.equals("1")) {

        } else if (myNum.equals("2")) {
            System.out.println("종료되었습니다.");
            System.exit(0);
        } else {
            System.out.println("잘못입력하셨습니다.\n게임을새로시작하려면 1,종료하려면" +
                    " 2를입력하세요.");
            myNum = scan.next();
            select(myNum);
        }

    }
}
