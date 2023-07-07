package thread;

public class CounterThread implements Runnable {
    public static Integer count = 5;
    public static Integer interval = 1000;

    @Override
    public void run() {
        String message = Thread.currentThread().getName();
        System.out.println(message);
        System.out.println("---End thread---");
    }

}