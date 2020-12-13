package com.edu;

public class ComputerNumber {

    private static final int COM_NUMBER_SIZE = 3;
    private static final int COM_NUMBER_END = 9;
    private static final int COM_NUMBER_START = 1;

    public String createComNumber() {
        String comNumber = "";

        while (comNumber.length() < COM_NUMBER_SIZE) {
            int randomNumber = createRandomNumber();

            if (comNumber.contains(String.valueOf(randomNumber))) {
                continue;
            }

            if (comNumber.length() < COM_NUMBER_SIZE) {
                comNumber += String.valueOf(randomNumber);
            }
        }

        return comNumber;
    }

    public int createRandomNumber() {
        return COM_NUMBER_START + (int) (Math.random() * COM_NUMBER_END);
    }

    public boolean checkComNumber(String comNumber) {

        for (int i = 0; i < comNumber.length(); i++) {

            char[] ch = comNumber.toCharArray();

            if (ch[i] < '1' || ch[i] > '9') {
                return false;
            }
        }
        return true;

    }

}
