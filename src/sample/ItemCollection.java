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

    }

}
