package com.edu;

import java.util.Scanner;

public class GameRestartSelector {

    private static final String GAME_RESTART_NUMBER = "1";
    private static final String GAME_END_NUMBER = "2";
    private static final String GAME_END_MESSAGE = "종료되었습니다.";
    private static final String GAME_PLAYING_MESSAGE = "게임을 새로시작하려면" +
            " 1,종료하려면 2를입력하세요. ";

    public boolean select(Scanner scan) {
        System.out.println(GAME_PLAYING_MESSAGE);
        String gameRestartNumber = scan.next();
        boolean isRestartCheck;
        isRestartCheck = playNumberCheck(gameRestartNumber);
        return isRestartCheck;
    }

    public boolean playNumberCheck(String gameRestartNumber) {
        if (gameRestartNumber.equals(GAME_RESTART_NUMBER)) {
            return true;
        }

        if (gameRestartNumber.equals(GAME_END_NUMBER)) {
            System.out.println(GAME_END_MESSAGE);
            return false;
        }

        throw new IllegalArgumentException("잘못된 입력값");
    }
}
