package item;

public class Drink {

    public static void main(String[] args) {
        // 名称
        String name;
        // 価格
        int price;
        // 個数
        int amount;
        // セール品か？
        boolean isSale;
        
        name = "コーヒー";
        price = 150;
        amount = 3;
        isSale = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        // Type Error
        // amount = "2";
        // isSale = 1;
        // name = 11111;

    }

}
