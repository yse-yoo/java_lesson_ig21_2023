package exam47.q2;

class Token implements Identifiable {
    //static変数
    static long number = 1;    
    //インスタンス変数（フィールド、プロパティ）
    long num;
    String attribute;

    Token() {
        System.out.println("Constructor of Super Class");
        num = number;
        number = number + 1;
        // number += 1;
    }
    
    void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String getIdentifer() {
        return attribute + "#" + num;
    }

}
