package shop;

import javax.sound.midi.Synthesizer;

public class EnumApp {
    
    public static void main(String[] args) {
        Drink coffee1 = new Drink("コーヒー", 300, Size.SMALL);
        Drink coffee2 = new Drink("コーヒー", 350, Size.MEDIUM);
        Drink coffee3 = new Drink("コーヒー", 400, Size.LARGE);

        System.out.println(coffee1.size);
        System.out.println(coffee2.size);
        System.out.println(coffee3.size);

        System.out.println(coffee1.size.getValue());
        System.out.println(coffee2.size.getValue());
        System.out.println(coffee3.size.getValue());

        System.out.println("--- values() ---");
        for (Size size : Size.values()) {
            System.out.println(size);
            System.out.println(size.getValue());
        }
        
        System.out.println("--- valueOf ---");
        String sizeString = "SMALL";
        System.out.println(Size.valueOf(sizeString));
    }

}
