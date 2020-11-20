package com.edu;

public class MyNumber {

    public int overlapCheck(String myNum, int cnt){

        int myNumLength = myNum.length();

        for (int i = 0; i < myNumLength; i++) {
            for (int j = 0; j < myNumLength; j++) {

                if (i == j){
                    continue;
                }

                if (myNum.charAt(i) == myNum.charAt(j)) {
                    cnt++;
                }
            }

            if(cnt >= 1){
                System.out.println("중복된 숫자는 입력할 수 없습니다.");
                break;
            }
        }

        return cnt;
    }
}
