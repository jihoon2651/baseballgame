package com.edu;

public class Restart {

    public String restart(String myNum, String comNum, int comN){

        ComnumCreate comnumCreate = new ComnumCreate();

        if (myNum.equals("1")) {
            comNum = "";
            comNum = comnumCreate.comNumCreate(comN,comNum);
            System.out.println(comNum);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        } else if (myNum.equals("2")) {
            System.out.println("종료되었습니다.");
            System.exit(0);
        }

        return comNum;
    }
}
