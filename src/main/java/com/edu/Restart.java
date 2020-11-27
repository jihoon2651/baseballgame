package com.edu;

import java.util.Scanner;

public class Restart {

    private static final String GAME_RESTART_NUMBER = "1";
    private static final String GAME_END_NUMBER = "2";
    private static final String GAME_END_MESSAGE = "종료되었습니다.";
    private static final String GAME_RESTART_MESSAGE = "잘못입력하셨습니다.\n게임을새로시작" +
            "하려면 1,종료하려면 2를입력하세요.";

    public boolean select(String myNumber) {
        Scanner scan = new Scanner(System.in);

        if (myNumber.equals(GAME_RESTART_NUMBER)) {

        } else if (myNumber.equals(GAME_END_NUMBER)) {
            System.out.println(GAME_END_MESSAGE);
            return false;
        } else {
            System.out.println(GAME_RESTART_MESSAGE);
            myNumber = scan.next();
            select(myNumber);
        }
        return true;
    }
}
