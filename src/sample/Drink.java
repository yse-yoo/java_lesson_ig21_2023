package sample;

import java.util.Arrays;

public class Drink {
    
    public static void main(String[] args) {
        // スニペット: syso
        System.out.println("Drink class");
        
        String name;
        int price;
        int amount;
        boolean isSale;

        name = "コーヒー";
        price = 150;
        amount = 3;
        isSale = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        // int に小数は代入できない
        // amount = 0.1f;

        // String に数値は代入できない
        // name = 100;
        // 文字列リテラルは代入できる
        // name = "100";

        // 定数（constant）
        final Float TAX_RATE = 0.1f;
        System.out.println(TAX_RATE);

        // 定数は値を再代入できない
        // TAX_RATE = 0.08f;

        // Array
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        System.out.println(drinks);
        System.out.println(Arrays.toString(drinks));

        // Ptyhon, JavaScript, PHP
        //drinks = ["コーヒー", "紅茶", "ほうじ茶"];

        // 2番目の値を取り出す
        String selectDrink = drinks[1];
        System.out.println(selectDrink);

        drinks[1] = "ウーロン茶";
        System.out.println(Arrays.toString(drinks));
        // Runtime Exception
        // drinks[3] = "オレンジジュース";

        // 要素数で初期化
        int[] numbers = new int[3];
        numbers[0] = 50;
        numbers[1] = 70;
        numbers[2] = 80;
        numbers[0] = 90;
        // Runtime Exception
        // numbers[3] = 90;
        System.out.println(Arrays.toString(numbers));

    }

}
