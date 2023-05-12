package questions;

public class Lesson5 {

    public static void main(String[] args) {
        // Q1
        String message = loginMessage("東京 太郎");
        System.out.println(message);

        // Q2
        int point = calculatePoint(400);
        System.out.println(point + "pt");
        point = calculatePoint(400, 0.05f);
        System.out.println(point + "pt");
    }

    public static String loginMessage(String userName) {
        String message = "ようこそ" + userName + "さん！";
        return message;
    }

    public static int calculatePoint(int price) {
        float point = price * 0.01f;
        return (int) point;
    }

    public static int calculatePoint(int price, float pointRate) {
        float point = (float) price * pointRate;
        return (int) point;
    }
}
