package PatternQuestions;

public class Pattern_13 {
    public static void main(String[] args) {
        Pattern1(6);
    }
    static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

            // 1 
            // 1 2
            // 1 2 3
            // 1 2 3 4
            // 1 2 3 4 5
            // 1 2 3 4 5 6
        }
    }
}
