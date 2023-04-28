package sample;

public class ItemRepeat {

    public static void main(String[] args) {
        // fori
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // forのネスト
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String plot = "(" + i + ", " + j + ")";
                System.out.print(plot);
            }
            System.out.println("");
        }

        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }
    }

}
