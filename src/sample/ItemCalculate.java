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
        price = 100;

        // price は 100ですか？
        is_match = (price == 100);
        System.out.println(is_match);
    }
    
}
