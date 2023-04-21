package sample;

public class ItemCalculate {

    public static void main(String[] args) {
        int answer;
        // 2項演算
        // answer = 1 + 2;
        // answer = answer + 3;
        // answer = answer - 2;
        // answer = answer * 5;
        // answer = answer / 2;

        // 複合演算
        answer = 1 + 2;
        answer += 3;
        answer -= 2;
        answer *= 5;
        answer /= 2;
        System.out.println(answer);

        // cast
        int price = 205;
        float pointRate = 0.01f;
        int point;

        point = (int) (price * pointRate);
        System.out.println(point + "pt");

        int amount = 5;
        // インクリメント(increment)
        amount++;
        amount++;
        System.out.println(amount);

        // デクリメント(decrement)
        amount--;
        amount--;
        System.out.println(amount);

        // over flow
        price = 100000;
        amount = 100000;

        long totalPrice = (long) price * (long) amount;
        System.out.println(totalPrice);

        // 論理演算
        boolean is_match = false;
        price = 1000;

        // price は 100ですか？
        is_match = (price == 100);
        System.out.println(is_match);

        // price は 100より小さいですか？
        is_match = (price < 100);
        System.out.println(is_match);

        // price は 100より大きいですか？
        is_match = (price > 100);
        System.out.println(is_match);

        // price は 100ではないですよね？
        is_match = (price != 100);
        System.out.println(is_match);

        // price は 100以下ですか？
        is_match = (price <= 100);
        System.out.println(is_match);

        // price は 100以上ですか？
        is_match = (price >= 100);
        System.out.println(is_match);

        // 同値
        System.out.println("---- 同値 ----");
        String str1 = "20";
        String str2 = "20";
        int number1 = 20;
        int number2 = 30;

        is_match = (str1 == str2);
        System.out.println(is_match);

        is_match = (number1 == number2);
        System.out.println(is_match);

        // コンパイルエラー
        // is_match = (str1 == number1);
        is_match = (Integer.parseInt(str1) == number1);
        System.err.println(is_match);

        // Python, PHP, JavaScript
        // is_match = (str1 === number1);

        // 三項演算
        // 商品価格
        price = 550;
        // 所持金
        int money = 1000;

        String message = (price <= money) ? "購入できます。" : "所持金が足りません";
        System.out.println(message);
    }
    
}
