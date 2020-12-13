package com.edu;

import java.util.Scanner;

public class User {

    public static final int COM_NUMBER_LENGTH = 3;
    private static final char USER_NUMBER_START = '1';
    private static final char USER_NUMBER_END = '9';
    private static final String INPUT_ERROE_MESSAGE = "잘못된 입력값";

    public String createUserNumber(Scanner scan) {
        String userNumber = scan.next();
        return userNumber;
    }

    public void checkValidUserNumber(String userNumber) throws IllegalArgumentException {
        int myNumLength = userNumber.length();

        if (myNumLength != COM_NUMBER_LENGTH) {
            throw new IllegalArgumentException(INPUT_ERROE_MESSAGE);
        }

        for (int i = 0; i < myNumLength; i++) {
            checkNumber(userNumber, i);
            checkOverlapNumber(userNumber, myNumLength, i);
        }

    }

    private void checkNumber(String userNumber, int i) {
        char[] ch = userNumber.toCharArray();

        if (ch[i] < USER_NUMBER_START || ch[i] > USER_NUMBER_END) {
            throw new IllegalArgumentException(INPUT_ERROE_MESSAGE);
        }
    }

    private void checkOverlapNumber(String userNumber, int myNumLength, int i) {
        for (int j = 0; j < myNumLength; j++) {

            if (i == j) {
                continue;
            }

            if (userNumber.charAt(i) == userNumber.charAt(j)) {
                throw new IllegalArgumentException(INPUT_ERROE_MESSAGE);
            }
        }
    }
}
