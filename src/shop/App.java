package shop;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();

        Drink drink1 = new Drink("コーヒー", 350, 100);
        Drink drink2 = new Drink("紅茶", 400, 10);
        Drink drink3 = new Drink("ほうじ茶", 300, 50);

        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);

        // 紅茶を取得
        Drink selectDrink = drinkList.get(1);
        System.out.println(selectDrink.name);
        System.out.println(selectDrink.price);
        System.out.println(selectDrink.stock);

        // 商品追加
        drinkList.add(new Drink("コーラ", 300, 100));

        // 商品情報更新
        drinkList.set(0, new Drink("アイスコーヒー", 250, 50));

        // 商品削除
        drinkList.remove(2);

        for (Drink drink : drinkList) {
            System.out.println(drink.name);            
        }
    }
}
