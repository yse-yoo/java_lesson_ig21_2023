package sample;

import javax.print.attribute.standard.Sides;

public class RspGame {
    
    public static void main(String[] args) {
        //グー
        final int ROCK = 0;
        //チョキ
        final int SCISSORS = 1;
        //パー
        final int PAPER = 2;
        int playerHand = PAPER;
        int pcHand = ROCK;
        int result = 0;
        String message = "";

        // じゃんけんのジャッジ
        result = (playerHand + 3 - pcHand) % 3;
        // じゃんけんの結果
        if (result == 0) {
            message = "Draw!";
        } else if (result == 1) {
            message = "You Lose...";
        } else {
            message = "You Win!!";
        }
        System.out.println(message);
    }

}
