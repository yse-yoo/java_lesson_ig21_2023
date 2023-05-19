package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemCollection {

    public static void main(String[] args) {
        List<String> drinks = Arrays.asList("コーヒー", "紅茶", "ほうじ茶");
        System.out.println(drinks);

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("コーヒー");
        drinkList.add("紅茶");
        drinkList.add("ほうじ茶");
        System.out.println(drinkList);

        String selectDrink = drinkList.get(1);
        System.out.println(selectDrink);

        drinkList.set(1, "オレンジジュース");
        System.out.println(drinkList);

        drinkList.remove(2);
        System.out.println(drinkList);

        int itemCount = drinkList.size();
        System.out.println(itemCount);

        drinkList.clear();
        System.out.println(drinkList);
    }

}
