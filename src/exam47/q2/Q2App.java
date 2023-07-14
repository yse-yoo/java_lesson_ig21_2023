package exam47.q2;

public class Q2App {
    
    public static void main(String[] args) {
        BracketToken brtoken1 = new BracketToken();
        BracketToken brtoken2 = new BracketToken();

        //static は new せずにアクセス
        BracketToken.number = 4;

        //インスタンスを作成してアクセス
        brtoken1.num = 4;
        brtoken2.num = 7;

    }
}
