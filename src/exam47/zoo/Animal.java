package exam47.zoo;

public class Animal {
    public String name;

    //オーバーロード
    public static void greed() {
        System.out.println("スーパークラスのStaticメソッドです");
    }

    //オーバーロード
    public static void greed(String message) {
        System.out.println(message);
    }

    public void walk() {

    }
}