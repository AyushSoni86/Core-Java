package PatternQuestions;

public class Pattern_04 {
    public static void main(String[] args) {
        Pattern3_1(9);
    }
    static void Pattern3_1(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }
}
