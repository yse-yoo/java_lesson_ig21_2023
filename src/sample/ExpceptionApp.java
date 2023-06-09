package sample;

public class ExpceptionApp {
    
    public static void main(String[] args) {
        float average;

        average = calculateAverage(300, 110);
        System.out.println(average);

    }

    public static Float calculateAverage(int score, int count) {
        return (float) score / (float) count;
    }
}
