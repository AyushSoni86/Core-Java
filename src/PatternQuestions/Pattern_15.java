package PatternQuestions;

public class Pattern_15 {
    public static void main(String[] args) {
        Pattern3_1(6);
    }
    static void Pattern3_1(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = n; col > row; col--) {
                System.out.print(n-row+ " ");
            }
            System.out.println();

        // 1 
        // 2 2
        // 3 3 3       
        // 4 4 4 4     
        // 5 5 5 5 5   
        // 6 6 6 6 6 6 
        // 5 5 5 5 5   
        // 4 4 4 4     
        // 3 3 3       
        // 2 2
        // 1
        }
    }
}
