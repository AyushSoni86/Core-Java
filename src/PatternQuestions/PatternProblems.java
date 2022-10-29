package PatternQuestions;

class PatternProblems{

    public static void main(String[] args)
	{
		char[] arr = {'*', '*', '*', '*', '*', '*', '*' } ;
        pattern_using_array(arr);
	}

    	static void Pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
        }
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

    	static void Pattern3(int n) {
        int row, col;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row = 1; row < n; row++) {
            for (col = 1; col < n - row + 1; col++) {
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


	static void Pattern4_1(int n) {

        for (int row = 1; row <= n ; row++) {
          for (int s = 1; s <= n - row ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

//	     *
//	    * *
//	   * * *
//	  * * * *
//	 * * * * *
//	* * * * * *

      }

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

	static void pattern_using_array(char[] arr)
	{
			int n = 7;
		//char[] arr = {'*', '*', '*', '*', '*', '*', '*' } ;		
		for( int i = 0 ; i < 7 ; i++ )
		{
			for ( int j = 0 ; j < 7 ; j++ )
			{
				System.out.print( ( i==0 || i==6 ) ?arr[i] + " ": (( j== 0 || j==6 ) ? arr[0]+" " : "  " ));
			}
			
			System.out.println();
		}

//		* * * * * * *
//		*           *
//		*           *
//		*           *
//		*           *
//		*           *
//		* * * * * * *
	}

	static void pattern6( int n )
	{
		int c = n * 2 - 1 ;
		for( int i = 1 ; i <= c ; i++ )
		{	
			for( int j = 1 ; j <= c ; j++ )
			{
				if( j == i || j == c-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

//	    	*         *
//	    	 *       *
// 	    	  *     *
// 	    	   *   *
//  		    * *
//   		     *
//   		    * *
//  		   *   *
//  		  *     *
// 	    	 *       *
//	    	*         *
	}


	 
}