package exam47.q3;

public class Q17_2 extends Q17 {
    void display() {
        // スーパークラスの privateの変数にはアクセスできない
        // System.out.println(x);
        System.out.println(getX());
    }
}
