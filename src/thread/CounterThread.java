package thread;

public class CounterThread implements Runnable {
    public static Integer count = 5;
    public static Integer interval = 1000;

    @Override
    public void run() {
        while (count > 0) {
            String message = Thread.currentThread().getName() + ":" + count;
            System.out.println(message);
            count--;
        }
        System.out.println("---End thread---");
    }

}