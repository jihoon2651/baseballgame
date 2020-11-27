package com.edu;

public class ComputerNumber {

    private static final int COM_NUMBER_SIZE = 3;
    private static final int COM_NUMBER_END = 9;
    private static final int COM_NUMBER_START = 1;

    public String createComNumber() {
        String comNumber = "";
        int comNum = 0;

        for (int i = 0; i < COM_NUMBER_SIZE; i++) {
            comNum = (int) (Math.random() * COM_NUMBER_END) + COM_NUMBER_START;
            if (comNumber.contains(String.valueOf(comNum))) {
                i--;
                continue;
            }
            comNumber += String.valueOf(comNum);
        }
        return comNumber;
    }

}
