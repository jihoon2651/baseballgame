package com.edu;

public class User {

    public static final int COM_NUMBER_LENGTH = 3;

    public boolean validUserNumber(String userNumber) throws Exception{
        int myNumLength = userNumber.length();
        boolean numberCheck = true;

        if (myNumLength != COM_NUMBER_LENGTH) {
            numberCheck = false;
            throw new Exception();
        }

        for (int i = 0; i < myNumLength; i++) {
            char[] ch = userNumber.substring(i, i + 1).toCharArray();

            if (ch[0] < 49 || ch[0] > 57) {
                numberCheck = false;
                throw new Exception();
            }

            for (int j = 0; j < myNumLength; j++) {

                if (i == j){
                    continue;
                }

                if (userNumber.charAt(i) == userNumber.charAt(j)) {
                    numberCheck = false;
                    throw new Exception();
                }
            }
        }
        return numberCheck;
    }
}
