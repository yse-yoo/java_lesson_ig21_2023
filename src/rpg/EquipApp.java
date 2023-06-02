package rpg;

import rpg.item.Item;

public class EquipApp {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Item weapon = new Item("ナイフ", 300, 5, 0);
        Item armor = new Item("布の服", 200, 0, 3);
    }

}
