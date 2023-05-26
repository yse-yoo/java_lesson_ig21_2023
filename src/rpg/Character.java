package rpg;

public class Character extends CharacterAbstract{
    // 初期化ブロック
    {
        System.out.println("初期化ブロック");
    }

    // constructor
    public Character(String name, String job) {
        this.name = name;
        this.job = job;
        this.hp = 50;
    }
    
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
    }

    // field(property)    
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int level;
    public int exp;
    public int attackPower;
    public int defencePower;

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
        int damage = this.attackPower - character.attackPower;
        if (damage > 0) character.hp -= damage;
    }

    @Override
    public void attack(Monster monster) {
        int damage = this.attackPower - monster.defencePower;
        if (damage > 0) monster.hp -= damage;
    }

    @Override
    public boolean isAlive() {
        return (this.hp > 0);
    }

}
