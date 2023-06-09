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
        int average = score / count;
        return (float) average;
    }
}
