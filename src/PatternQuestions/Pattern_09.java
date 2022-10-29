package PatternQuestions;

public class Pattern_09 {
    public static void main(String[] args) {
        char[] arr = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' } ;
        pattern_using_array(arr, arr.length);
    }
    static void pattern_using_array(char[] arr, int n)
	{
			// int n = 7;
		//char[] arr = {'*', '*', '*', '*', '*', '*', '*' } ;		
		for( int i = 0 ; i < n ; i++ )
		{
			for ( int j = 0 ; j < n ; j++ )
			{
				System.out.print( ( i==0 || i==n-1 ) ?arr[i] + " ": (( j== 0 || j==n-1 ) ? arr[0]+" " : "  " ));
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
}
