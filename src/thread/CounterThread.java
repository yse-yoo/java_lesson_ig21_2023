package thread;

public class CounterThread implements Runnable {
    public static Integer count = 5;
    public static Integer interval = 1000;

    @Override
    public void run() {
        synchronized (count) {
            while (count > 0) {
                try {
                    Thread.sleep(interval);
                    String message = Thread.currentThread().getName() + ":" + count;
                    System.out.println(message);
                    count--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count = 5;
            System.out.println("---End thread---");
        }
    }

}