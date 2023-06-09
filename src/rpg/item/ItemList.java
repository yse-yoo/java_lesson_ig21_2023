package rpg.item;

import java.util.ArrayList;

public class ItemList {
    
    ArrayList<Item> list = new ArrayList<>();

    public ItemList() {
        this.loadCSV();
    }

    public void loadCSV() {
       System.out.println("CSV読み込み"); 
    }    

}
