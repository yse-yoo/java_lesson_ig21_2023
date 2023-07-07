package thread;

import java.util.ArrayList;

public class OrderApp {
    
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("コーヒー"));
        items.add(new Item("紅茶"));
        items.add(new Item("ほうじ茶"));

        //通常の foreach
        for (Item item : items) {
            ShopThread thread = new ShopThread(item);
            thread.start();
        }

        // ラムダ式
        items.forEach(item -> {
            ShopThread thread = new ShopThread(item);
            thread.start();
        });
    }

}
