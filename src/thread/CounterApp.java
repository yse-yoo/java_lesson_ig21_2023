package thread;

public class CounterApp {
    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread1.start();
        thread2.start();
    }
}
