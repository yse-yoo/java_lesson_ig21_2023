package sample;

public class Drink {
    
    public static void main(String[] args) {
        // スニペット: syso
        System.out.println("Drink class");
        
        String name;
        int price;
        int amount;
        boolean isSale;

        name = "コーヒー";
        price = 150;
        amount = 3;
        isSale = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        // int に小数は代入できない
        // amount = 0.1f;

        // String に数値は代入できない
        // name = 100;
        // 文字列リテラルは代入できる
        // name = "100";

    }

}
