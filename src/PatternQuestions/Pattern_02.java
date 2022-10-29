package PatternQuestions;

public class Pattern_02 {
    public static void main(String[] args) {
        Pattern2(7);
    }
    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
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
