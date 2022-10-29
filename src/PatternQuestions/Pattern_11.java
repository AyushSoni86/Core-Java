package PatternQuestions;

public class Pattern_11 {
    public static void main(String[] args) {
        pattern6(5);
    }
        static void pattern6( int n )
	{
        int k = n*2 ;
		int c = n * 2 - 1 ;
		for( int i = 1 ; i <= c ; i++ )
		{	
			for( int j = 1 ; j <= c ; j++ )
			{
				if( j == i || j == c-i+1)
					System.out.print((i > n)? k-1 : i);
				else
					System.out.print(" ");
			}
            k--;
			System.out.println();
		}

	}
//    1       1
//     2     2 
//      3   3  
//       4 4   
//        5    
//       4 4   
//      3   3  
//     2     2 
//    1       1

}
