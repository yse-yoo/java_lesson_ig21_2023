package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character();
        System.out.println(wizard);

        wizard.name = "アリス";
        wizard.job = "Wizard";
        wizard.hp = 30;

        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

    }

}
