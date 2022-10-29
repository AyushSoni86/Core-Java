package PatternQuestions;

public class Pattern_14 {
    public static void main(String[] args) {
        Pattern3(6);
    }
    static void Pattern3(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = 1; col < n - row + 1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        // 1 
        // 1 2
        // 1 2 3       
        // 1 2 3 4     
        // 1 2 3 4 5   
        // 1 2 3 4 5 6 
        // 1 2 3 4 5   
        // 1 2 3 4     
        // 1 2 3       
        // 1 2
        // 1
        }
    }
}
