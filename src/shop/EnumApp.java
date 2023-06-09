package shop;

public class EnumApp {
    
    public static void main(String[] args) {
        Drink coffee1 = new Drink("コーヒー", 300, Size.SMALL);
        Drink coffee2 = new Drink("コーヒー", 350, Size.MEDIUM);
        Drink coffee3 = new Drink("コーヒー", 400, Size.LARGE);

        System.out.println(coffee1.size);
        System.out.println(coffee2.size);
        System.out.println(coffee3.size);

        
    }

}
