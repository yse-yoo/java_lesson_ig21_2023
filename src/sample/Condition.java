package sample;

public class Condition {

    public static void main(String[] args) {
        // 価格
        int price = -200;
        // 所持金
        int money = 1000;
        // メッセージ
        String message = "";

        if (price <= 0) {
            message = "価格が正しくありません。";
        } else if (money >= price) {
            message = "お買い上げありがとうございます。";
        } else {
            message = "所持金が足りません。";
        }

        System.out.println(message);
    }

}
