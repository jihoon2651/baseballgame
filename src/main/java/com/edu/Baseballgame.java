package com.edu;

import java.util.Scanner;

public class Baseballgame {

    private static final String NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_RESTART_MESSAGE = "3 스트라이크\n3개의 숫자를모두" +
            "맞히셨습니다! 게임종료\n게임을새로시작하려면 1,종료하려면 2를입력하세요.";

    public void playBaseballGame() {
        Scanner scan = new Scanner(System.in);
        Hint hint = new Hint();
        ComputerNumber computerNumber = new ComputerNumber();
        Restart restart = new Restart();
        String comNumber = "";
        comNumber = computerNumber.createComNumber();
        boolean gameCheck = true;

        while (gameCheck) {
            System.out.print(NUMBER_INPUT_MESSAGE);
            String userNumber = "";
            userNumber = scan.next();

            if (userNumber.equals(comNumber)) {
                System.out.println(GAME_RESTART_MESSAGE);
                userNumber = scan.next();
                gameCheck = restart.select(userNumber);
                comNumber = computerNumber.createComNumber();
            } else {
                hint.giveHintInfo(userNumber, comNumber);
            }
        }
    }

    public static void main(String[] args) {
        Baseballgame baseballgame = new Baseballgame();
        baseballgame.playBaseballGame();
    }

}
