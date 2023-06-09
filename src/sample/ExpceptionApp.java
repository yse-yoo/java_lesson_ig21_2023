package sample;

public class ExpceptionApp {
    
    public static void main(String[] args) {
        float average;

        average = calculateAverage(300, 110);
        System.out.println(average);

        average = calculateAverage(300, 0);
        System.out.println(average);
    }

    public static float calculateAverage(int score, int count) {
        if (count == 0) {
            System.out.println("count が 0 です。");
            return 0.f;
        }
        int average = score / count;
        return (float) average;
    }
}
