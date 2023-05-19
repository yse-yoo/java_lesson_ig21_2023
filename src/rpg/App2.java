package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        Warrior warrior = new Warrior("ボブ");
        wizard.talk(warrior, "こんにちは");

        Monster monster1 = new Monster();
        wizard.attack(monster1);
        System.out.println("Monster:" + monster1.hp);
        warrior.attack(monster1);
        System.out.println("Monster:" + monster1.hp);
        monster1.attack(wizard);
        System.out.println("Wizard:" + wizard.hp);
    }

}
