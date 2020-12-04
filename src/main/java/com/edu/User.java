package com.edu;

public class User {

    public static final int COM_NUMBER_LENGTH = 3;

    public void validUserNumber(String userNumber) throws IllegalArgumentException {
        int myNumLength = userNumber.length();
        // 길이 확인
        if (myNumLength != COM_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < myNumLength; i++) {
            // 숫자가 아닌 경우
            checkNumber(userNumber, i);
            // 중복 확인
            checkOverlapNumber(userNumber, myNumLength, i);
        }

    }

    private void checkNumber(String userNumber, int i) {
        char[] ch = userNumber.toCharArray();

        if (ch[i] < 49 || ch[i] > 57) {
            throw new IllegalArgumentException();
        }
    }

    private void checkOverlapNumber(String userNumber, int myNumLength, int i) {
        for (int j = 0; j < myNumLength; j++) {

            if (i != j && userNumber.charAt(i) == userNumber.charAt(j)) {
                throw new IllegalArgumentException();
            }
        }
    }
}
