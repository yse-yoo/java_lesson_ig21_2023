package questions;

import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {

        String[] items = { "PC", "TV", "エアコン" };
        // fori
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        // foreach
        for (String item : items) {
            System.out.println(item);
        }

        int year = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("預金額を入力してください（円）");
        double money = scanner.nextDouble();
        System.out.println("目標額を入力してください（円）");
        double target = scanner.nextDouble();
        System.out.println("金利を入力してください（%）");
        double rate = 1 + scanner.nextDouble() / 100;
        while (money < target) {
            money *= rate;
            year++;
        }
        System.out.println(year + "年");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
