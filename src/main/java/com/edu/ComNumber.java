package com.edu;

public class ComNumber {

    public static final int COM_NUMBER_SIZE = 3;
    public static final int MAX_COM_NUMBER_RANDOM = 9;
    public static final int COM_NUMBER_START = 1;

    public String comNumCreate() {

        String comNumStr = "";
        int comNum = 0;

        for (int i = 0; i < COM_NUMBER_SIZE; i++) {
            comNum = (int) (Math.random() * MAX_COM_NUMBER_RANDOM) +
                    COM_NUMBER_START;
            if (!comNumStr.contains(Integer.toString(comNum))) {
                comNumStr += Integer.toString(comNum);
            } else {
                i--;
            }
        }

        return comNumStr;
    }

}
