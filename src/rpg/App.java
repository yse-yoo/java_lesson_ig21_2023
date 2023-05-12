package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character("アリス", "Wizard");
        Character warrior = new Character("ボブ", "Warrior");

        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

        System.out.println(warrior.name);
        System.out.println(warrior.job);
        System.out.println(warrior.hp);

        wizard.walk("left");
        wizard.talk(warrior, "勝負しよう！");

        wizard.attack(warrior);
        warrior.attack(wizard);

        System.out.println(wizard.hp);
        System.out.println(warrior.hp);
    }

}
