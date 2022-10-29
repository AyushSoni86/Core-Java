package PatternQuestions;

public class Pattern_10 {
    public static void main(String[] args) {
        pattern6(6);
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
