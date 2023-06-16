package rpg.item;

public class Item {

    public Item(String name, int price, int attackPower, int defencePower) {
        this.name = name;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public Item(long id, String name, ItemType type, int price, int attackPower, int defencePower) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    private long id;
    private String name;
    private ItemType type;

    private int price;
    private int attackPower;
    private int defencePower;

    // accessor method
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ItemType getType() {
        return type;
    }
    public void setType(ItemType type) {
        this.type = type;
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
