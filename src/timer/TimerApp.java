package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    public static int seconds = 3;
    
    public static void main(String[] args) {
        String message = seconds + "秒後に実行します";
        System.out.println(message);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("実行しました！");
                timer.cancel();
            }
        };

        // msに変換
        int ms = seconds * 1000;
        // タイマー実行
        timer.schedule(task, ms);
    }

}
