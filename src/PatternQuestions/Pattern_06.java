package PatternQuestions;

public class Pattern_06 {
    public static void main(String[] args) {
        Pattern4(6);
    }
    static void Pattern4(int n) {

        for (int row = 1; row <= n ; row++) {
           // int TotalNumberOfCol = row > n ? 2 * n - row : row;
	//    int totalSpaces = n - TotalNumberOfCol ;
	    for (int s = 1; s <= row ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

//	 *
//	  * *
//	   * * *
//	    * * * *
//	     * * * * *
//	      * * * * * *
      }

    }
}
