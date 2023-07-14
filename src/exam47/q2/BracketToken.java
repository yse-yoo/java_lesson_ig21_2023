package exam47.q2;

public class BracketToken extends Token {
    public String getIdentifer() {
        return "[" + super.getIdentifer() +  "]";
    }
}
