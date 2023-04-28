package sample;

public class Condition {

    public static void main(String[] args) {
        // 価格
        int price = 100;
        // 最大価格
        int maxPrice = 10000000;
        // 所持金
        int money = 1000;
        // メッセージ
        String message = "";

        // OR（どちらかがtrueだったら処理）:  || 
        if (price <= 0 || price >= maxPrice) {
            message = "価格が正しくありません。";
        } else if (money >= price) {
            message = "お買い上げありがとうございます。";
        } else {
            message = "所持金が足りません。";
        }

        System.out.println(message);

        // switch
        String dayString = "月";
        String garbage = "";
        switch (dayString) {
            case "月":
                garbage = "燃えるゴミ";
                break;

            default:
                break;
        }
        System.out.println(garbage);
    }

}
