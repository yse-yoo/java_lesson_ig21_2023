package rpg;

public class Character {
    
    // constructor
    public Character(String name, String job) {
        this.name = name;
        this.job = job;
        this.hp = 50;
    }

    // 初期化ブロック
    {
        System.out.println("初期化ブロック");
    }

    // field(property)    
    public String name;
    public String job;
    public int hp;

    // class method
    public void walk(String direction) {
        String message = this.name + " move to " + direction;    
        System.out.println(message);
    }

    public void talk(Character character, String message) {
        message = character.name + "!" + message;
        System.out.println(message);
    }

    public void attack(Character character) {
        int damage = 5;
        character.hp -= damage;
    }
}
