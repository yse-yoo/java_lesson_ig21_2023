package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        Warrior warrior = new Warrior("ボブ");
        wizard.talk(warrior, "こんにちは");

        Monster monster1 = new Monster();
        wizard.attack(monster1);
        warrior.attack(monster1);
        monster1.attack(wizard);
        System.out.println(monster1.hp);
    }

}
