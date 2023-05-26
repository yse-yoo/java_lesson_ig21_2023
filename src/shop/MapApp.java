package shop;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    
    public static void main(String[] args) {
        // Ctrl + . で Quick Fix
        Map<String, String> drinkMap = new HashMap<>();
        drinkMap.put("D0001", "コーヒー");
        drinkMap.put("D0002", "紅茶");
        drinkMap.put("D0003", "ほうじ茶");

        // データ取得
        String drinkName = drinkMap.get("D0003");
        System.out.println(drinkName);

        // データ個数
        int drinkCount = drinkMap.size();
        System.out.println(drinkCount);

        // キーの繰り返し
        for (String key : drinkMap.keySet()) {
            System.out.println(key);
        }

        // 値の繰り返し
        for (String value : drinkMap.values()) {
            System.out.println(value);
        }

        // データ削除
        drinkMap.remove("D0002");

        // 繰り返し
        for (String key : drinkMap.keySet()) {
            String name = drinkMap.get(key);
            System.out.println(key + ":" + name);
        }

        Map<String, Drink> drinkMap2 = new HashMap<>();
        drinkMap2.put("D0001", new Drink("コーヒー", 350, 100));
        drinkMap2.put("D0002", new Drink("紅茶", 400, 10));
        drinkMap2.put("D0003", new Drink("ほうじ茶", 300, 50));

        Drink selectDrink = drinkMap2.get("D0001");
        System.out.println(selectDrink.name);

        // 合計金額
        int totalPrice = 0;
        for (Drink drink : drinkMap2.values()) {
            totalPrice += drink.price * drink.stock;
        }
        System.out.println(totalPrice);
    }

}
