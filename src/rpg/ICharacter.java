package rpg;

public interface ICharacter {

    public void attack(Monster monster);
    public boolean isAlive();
    public void magic(Monster monster, String key);
}
