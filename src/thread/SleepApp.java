package thread;

import java.util.ArrayList;

public class SleepApp {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("コーヒー"));
        items.add(new Item("紅茶"));
        items.add(new Item("ほうじ茶"));

        for (Item item : items) {
           item.order(); 
        }
    }
    
}
