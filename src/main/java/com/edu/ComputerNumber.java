package com.edu;

public class ComputerNumber {

    private static final int COM_NUMBER_SIZE = 3;
    private static final int COM_NUMBER_END = 9;
    private static final int COM_NUMBER_START = 1;

    public String createComNumber() {
        String comNumber = "";

        for (int i = 0; i < COM_NUMBER_SIZE; i++) {
            int randomNumber = (int) (Math.random() * COM_NUMBER_END) + COM_NUMBER_START;
            if (comNumber.contains(String.valueOf(randomNumber))) {
                i--;
                continue;
            }
            comNumber += String.valueOf(randomNumber);
        }
        return comNumber;
    }

}
