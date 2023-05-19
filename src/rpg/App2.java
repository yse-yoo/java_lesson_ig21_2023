package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        Warrior warrior = new Warrior("ボブ");
        wizard.talk(warrior, "こんにちは");
    }

}
