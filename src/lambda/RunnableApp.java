package lambda;

public class RunnableApp {
    public static void main(String[] args) {
        Runnable runner = ()-> System.out.println("Hello!");
        runner.run();
    }

}
