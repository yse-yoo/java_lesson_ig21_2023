package exam47.q4;

public class Q25 {

    public static void main(String[] args) {
        // t = [[1, 2], [3, 4], [5]];
        int[][] t = { { 1, 2 }, { 3, 4 }, { 5 } };
        for (int[] a : t) {
           for (int n : a) {
                System.out.print(n + ", ");
           } 
        }
    }
}
