package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character();
        System.out.println(wizard);

        wizard.name = "アリス";
        wizard.job = "Wizard";
        wizard.hp = 30;

        Character warrior = new Character();
        warrior.name = "ボブ";
        warrior.job = "Warrior";
        warrior.hp = 50;

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
