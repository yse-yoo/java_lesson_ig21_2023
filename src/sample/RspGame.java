package sample;

public class RspGame {
    
    public static void main(String[] args) {
        final int ROCK = 0;
        final int SCISSORS = 1;
        final int PAPER = 2;
        int playerHand = ROCK;
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
