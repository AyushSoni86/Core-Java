package PatternQuestions;

public class Pattern_03 {
    public static void main(String[] args) {
        Pattern2_1(7);
    }
    static void Pattern2_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();

//            * * * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
        }
    }
}
