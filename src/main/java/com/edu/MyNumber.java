package com.edu;

public class MyNumber {

    public int validation(String myNum, int validationCnt){

        int myNumLength = myNum.length();

        if (myNumLength > 3) {
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
                System.out.print("중복된 숫자나 3자리를 넘어갈 수 없습니다");
                break;
            }
        }

        return validationCnt;
    }
}
