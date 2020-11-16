package com.edu;
// 처음했던 버전
import java.util.Scanner;

public class BaseballgameVer1 {

    public String solution(){

        return "";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int conN = 0;
        String comNum = "";
        String myNum = "";
        int strike = 0;
        int ball = 0;
        conN = (int)(Math.random()*999) + 111;
        System.out.println(conN);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        comNum = Integer.toString(conN);

        while (true){
            strike = 0;
            ball = 0;
            System.out.print("숫자를 입력해주세요 : ");
            myNum = scan.next();

            if(myNum.equals(comNum)){
                System.out.println("3 스트라이크\n3개의숫자를모두맞히셨습다! 게임종료\n" +
                        "게임을새로시작하려면 1,종료하려면 2를입력하세요.");

                myNum = scan.next();
                if(myNum.equals("1")){
                    conN = (int)(Math.random()*999) + 111;
                    comNum = Integer.toString(conN);
                    System.out.println(conN);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    continue;
                }else if(myNum.equals("2")){
                    System.out.println("종료되었습니다.");
                    break;
                }

            }else{

                for (int i = 0; i < myNum.length(); i++) {

                    if (comNum.contains(myNum.substring(i,i+1))){
                        ball++;
                    }

                    if (comNum.substring(i,i+1).equals(myNum.substring(i,i+1))){
                        strike++;
                    }

                }

                if(ball == 0){
                    System.out.println("낫싱");
                }else if(strike > 0 && strike-ball == 0){
                    System.out.println(strike + "스트라이크");
                }else if(strike > 0 && ball > 0 && strike-ball > 0){
                    System.out.println(strike + "스트라이크 " + (strike-ball) + "볼 ");
                }else if(strike > 0 && ball > 0 && ball-strike > 0){
                    System.out.println(strike + "스트라이크 " + (ball-strike) + "볼 ");
                }else{
                    System.out.println(ball + "볼");
                }
                strike = 0;
                ball = 0;
            }
        }

    }




}
