package com.edu;

import java.util.Scanner;

public class BaseballGame {

    private static final String NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_ANSWER_MESSAGE = "3 스트라이크\n3개의 숫자를모두" +
            "맞히셨습니다! 게임종료\n게임을새로시작하려면 1,종료하려면 2를입력하세요.";

    public void playBaseballGame(Scanner scan) {
        Hint hint = new Hint();
        Restart restart = new Restart();
        ComputerNumber computerNumber = new ComputerNumber();
        String comNumber = computerNumber.createComNumber();
        boolean isGameProgressCheck = true;

        while (isGameProgressCheck) {
            System.out.print(NUMBER_INPUT_MESSAGE);
            String userNumber = scan.next();

            if (userNumber.equals(comNumber)) {
                System.out.println(GAME_ANSWER_MESSAGE);
                isGameProgressCheck = restart.select(scan);
                comNumber = computerNumber.createComNumber();
            } else {
                String hintInfo = hint.giveHintInfo(userNumber, comNumber);
                System.out.println(hintInfo);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseballGame baseballgame = new BaseballGame();
         baseballgame.playBaseballGame(scan);
    }

}
