package rpg;

public class App3 {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Wizard wizard2 = new Wizard("テリー");
        Warrior warrior1 = new Warrior("ボブ");

        Character[] characters = {
            wizard1,
            wizard2,
            warrior1,
        };
        Monster monster1 = new Monster();

        for (Character character : characters) {
            System.out.println(character.name + "のこうげき！");
            character.attack(monster1);
            System.out.println(monster1.hp);
        }

    }

}
