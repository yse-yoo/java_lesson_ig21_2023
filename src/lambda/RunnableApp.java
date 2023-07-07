package lambda;

public class RunnableApp {
    public static void main(String[] args) {
        Runnable runner = ()-> System.out.println("Hello!");
        runner.run();

        Runnable runner2 = ()-> {
            System.out.println("Hello!");
            System.out.println("GoodBye!");
        };
        runner2.run();

        showMessage(runner);
        showMessage(runner2);
    }

    public static void showMessage(Runnable runner) {
        System.out.println("--- Ready ---");
        runner.run();
    }
}
