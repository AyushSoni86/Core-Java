package PatternQuestions;

public class Pattern_05 {
    public static void main(String[] args) {
        Pattern3_2(6);
    }
    static void Pattern3_2(int n) {

        for (int row = 1; row <= n * 2 - 1; row++) {
            int TotalNumberOfCol = row > n ? 2 * n - row : row;
            for (int col = 1; col <= TotalNumberOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


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
