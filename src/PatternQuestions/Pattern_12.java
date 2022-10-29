package PatternQuestions;

public class Pattern_12 {
    public static void main(String[] args) {
        Pattern1(6);
    }
    static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();

    //       1 
    //       2 2 
    //       3 3 3
    //       4 4 4 4
    //       5 5 5 5 5
    //       6 6 6 6 6 6
        }
    }
}
