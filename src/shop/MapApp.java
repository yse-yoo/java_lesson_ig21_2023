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

        // 繰り返し
        for (String key : drinkMap.keySet()) {
            String name = drinkMap.get(key);
            System.out.println(key + ":" + name);
        }

    }

}
