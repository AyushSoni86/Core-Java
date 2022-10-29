package PatternQuestions;

import java.util.*;
class Pattern_using_Arrays
{
	public static void main(String[] args)
	{
		int n = 7;
		char[] arr = {'*', '*', '*', '*', '*', '*', '*' } ;		
		for( int i = 0 ; i < 7 ; i++ )
		{
			for ( int j = 0 ; j < 7 ; j++ )
			{
				System.out.print( ( i==0 || i==6 ) ?arr[i] + " ": (( j== 0 || j==6 ) ? arr[0]+" " : "  " ));
			}
			
			System.out.println();
		}
	}
}