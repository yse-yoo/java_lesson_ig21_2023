package rpg;

import rpg.item.Item;

public class EquipApp {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Item weapon = new Item("ナイフ", 300, 5, 0);
        Item armor = new Item("布の服", 200, 0, 3);

        System.out.println(wizard1.name);
        System.out.println("--- before ---");
        System.out.println(wizard1.attackPower);
        System.out.println(wizard1.defencePower);

        wizard1.equip(weapon);
        wizard1.equip(armor);

        System.out.println("--- after ---");
        System.out.println(wizard1.attackPower);
        System.out.println(wizard1.defencePower);

    }

}
