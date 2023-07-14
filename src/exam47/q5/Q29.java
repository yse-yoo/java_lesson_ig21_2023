package exam47.q5;

public class Q29 {
    
    public static void main(String[] args) {
        double width = 12.0;
        double height = 24.0;
        double result = 0;

        Type t = Type.A;
        switch (t) {
            case A:
                result = width * height;
                break;
            case B:
                result = width * height / 2;
                break;
        }
        System.out.println(result);
    }

}
