package rpg;

public class Character {
    // field(property)    
    String name;
    String job;
    int hp;

    // class method
    public void walk(String direction) {
        String message = this.name + " move to " + direction;    
        System.out.println(message);
    }

}
