package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer;
        answer = calculate(2.f);
        System.out.println(answer);
    }

    // public_static_method
    public static Float calculate(Float x) {
        Float y = x + 5;    
        return y;
    }

}
