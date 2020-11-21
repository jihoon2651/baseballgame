package com.edu;

public class MyNumber {

    public static final int MAX_COM_NUMBER_LENGTH = 3;

    public int validation(String myNum, int validationCnt){

        int myNumLength = myNum.length();

        if (myNumLength > MAX_COM_NUMBER_LENGTH) {
            validationCnt++;
        }

        for (int i = 0; i < myNumLength; i++) {
            for (int j = 0; j < myNumLength; j++) {

                if (i == j){
                    continue;
                }

                if (myNum.charAt(i) == myNum.charAt(j)) {
                    validationCnt++;
                }
            }

            if(validationCnt >= 1){
                System.out.print("중복된 숫자나 3자리를 초과할 수 없습니다");
                break;
            }
        }

        return validationCnt;
    }
}
