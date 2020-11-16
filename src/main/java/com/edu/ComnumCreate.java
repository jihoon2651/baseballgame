package com.edu;

public class ComnumCreate {

    public String comNumCreate(int comN, String comNum){

        for (int i = 0; i < 3; i++) {
            comN = (int) (Math.random() * 9) + 1;

            if (!comNum.contains(Integer.toString(comN))) {
                comNum += Integer.toString(comN);
            } else {
                i--;
            }

        }

        return comNum;
    }

}
