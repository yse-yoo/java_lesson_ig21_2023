package rpg.item;

public class Item {

    public Item(String name, int price, int attackPower, int defencePower) {
        this.name = name;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    private String name;
    private int price;
    private int attackPower;
    private int defencePower;

    // accessor method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public int getDefencePower() {
        return defencePower;
    }
    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }
    
}
