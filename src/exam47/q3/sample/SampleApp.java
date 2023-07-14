package exam47.q3.sample;

import exam47.q3.account.Q19;

public class SampleApp {
    
    public static void main(String[] args) {
        Q19 q19 = new Q19();
        // パッケージが違う場合、public でないとアクセスできない
        // q19.setAmount(100);
        int amount = q19.getAmount();
    }
}
