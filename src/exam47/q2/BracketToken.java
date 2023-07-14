package exam47.q2;

public class BracketToken extends Token {
    //デフォルトコンストラクタ
    // public BracketToken() {
    //     super();
    // }

    public String getIdentifer() {
        return "[" + super.getIdentifer() +  "]";
    }
}
