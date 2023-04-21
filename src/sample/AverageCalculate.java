package sample;

import java.util.Scanner;

public class AverageCalculate {
    
    public static void main(String[] args) {
        System.out.println("平均点の計算");    

        Scanner sc = new Scanner(System.in);

        System.err.println("国語の点数を入力してください");
        int japanese = sc.nextInt();

        System.err.println("算数の点数を入力してください");
        int mathmatic = sc.nextInt();

        System.err.println("理科の点数を入力してください");
        int science = sc.nextInt();

        System.err.println("社会の点数を入力してください");
        int society = sc.nextInt();

        // 平均点（average）
        float average = (japanese + mathmatic + science + society) / 4.0f;

        String message = "平均点は" + average + "です。";
        System.out.println(message);

    }

}
