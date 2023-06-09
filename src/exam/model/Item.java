package exam.model;

public class Item {

    public Item(String type, String name, int price) {
        setType(type);
        setName(name);
        setPrice(price);
    }

    // 商品名
    private String name;
    // 価格（税込み）
    private int price;
    // 商品タイプ
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}