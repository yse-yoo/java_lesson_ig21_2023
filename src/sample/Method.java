package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer;
        answer = calculate(2.f);
        System.out.println(answer);

        // non static method(class method) は直接呼び出せない
        Method method = new Method();
        answer = method.calculate2(2.f);

        int totalPrice = calculateTotalPrice(200, 5);
        System.out.println(totalPrice);

        greet("YSE");
        greet("YSE", "晴れ");
    }

    // Python
    // def calculate:

    // public_static_method
    public static Float calculate(Float x) {
        Float y = x + 5;    
        return y;
    }

    // instance method(non-staic method)
    public Float calculate2(Float x) {
        Float y = x + 5;    
        return y;
    }

    public static int calculateTotalPrice(int price, int amount) {
        int totalPrice = price * amount;
        return totalPrice; 
    }

    public static int calculateTotalPrice(int price, int amount, float taxRate) {
        float totalPrice = price * amount * (1 + taxRate);
        return (int) totalPrice; 
    }

    public static int calculateTotalPrice(int price, int amount, boolean isSale) {
        float totalPrice = price * amount;
        return (int) totalPrice; 
    }
    
    public static void greet(String name) {
        String message = name + "さん、こんにちは"; 
        System.out.println(message);
    }

    public static void greet(String name, String weather) {
        String message = name + "さん。" + "今日は" + weather + "ですね"; 
        System.out.println(message);
    }
}
