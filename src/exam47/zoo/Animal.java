package exam47.zoo;

public class Animal {
    public String name;

    public static void greed() {
        System.out.println("スーパークラスのStaticメソッドです");
    }

    public static void greed(String message) {
        System.out.println(message);
    }

}