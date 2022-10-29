package PatternQuestions;

public class Pattern_08 {
    public static void main(String[] args) {
        Pattern5(6);
    }
    static void Pattern5(int n) {

        for (int row = 1; row <= n * 2 - 1; row++) {
            int TotalNumberOfCol = row > n ? 2 * n - row : row;
	    int totalSpaces = n - TotalNumberOfCol ;
	    for (int s = 1; s <= totalSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalNumberOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//		     *
//		    * *
//		   * * *
//		  * * * *
//		 * * * * *
//		* * * * * *
//		 * * * * *
//		  * * * *
//		   * * *
//		    * *	
//		     *
    }
}
