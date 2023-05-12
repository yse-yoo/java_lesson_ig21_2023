package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer;
        answer = calculate(2.f);
        System.out.println(answer);

        // non static method(class method) は直接呼び出せない
        // answer = calculate2(2.f);
    }

    // public_static_method
    public static Float calculate(Float x) {
        Float y = x + 5;    
        return y;
    }

    // class method(non-staic method)
    public Float calculate2(Float x) {
        Float y = x + 5;    
        return y;
    }

    public static int calculateTotalPrice(int price, int amount) {
        int totalPrice = price * amount;
        return totalPrice; 
    }
}
