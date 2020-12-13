package com.edu;

import java.util.Scanner;

public class BaseballGame {

    private static final String NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_ANSWER_MESSAGE = "3 스트라이크\n3개의 숫자를모두" +
            "맞히셨습니다! 게임종료";
    private static final String GAME_ERROR_MESSAGE = "잘못입력하셨습니다. 또 다시 잘못입력" +
            " 할 경우 게임이 종료됩니다.";

    public ComputerNumber computerNumber = new ComputerNumber();
    public GameRestartSelector gameRestartSelector = new GameRestartSelector();
    private boolean canPlayGame = true;

    public void playBaseballGame(Scanner scan) {
        Hint hint = new Hint();
        User user = new User();
        String comNumber = computerNumber.createComNumber();
        while (canPlayGame) {
            System.out.print(NUMBER_INPUT_MESSAGE);
            String userNumber = user.createUserNumber(scan);

            if (userNumber.equals(comNumber)) {
                canPlayGame = canGameRestart(scan);
                comNumber = createComputerNumber(comNumber, canPlayGame);
                continue;
            }

            if (!userNumber.equals(comNumber)) {
                String hintInfo = hint.giveHintInfo(userNumber, comNumber);
                System.out.println(hintInfo);
            }

        }
    }

    private boolean canGameRestart(Scanner scan) {
        try {
            System.out.println(GAME_ANSWER_MESSAGE);
            canPlayGame = gameRestartSelector.select(scan);
        } catch (IllegalArgumentException e) {
            System.out.println(GAME_ERROR_MESSAGE);
            canPlayGame = gameRestartSelector.select(scan);
        }
        return canPlayGame;
    }

    private String createComputerNumber(String comNumber, boolean canPlayGame) {
        if (canPlayGame) {
            comNumber = computerNumber.createComNumber();
        }
        return comNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BaseballGame baseballgame = new BaseballGame();
        baseballgame.playBaseballGame(scan);
    }

}
