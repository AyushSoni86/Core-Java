import java.util.*;
class Perfect_Number_Within_Range
{
	public static void main(String[] args)
	{
		System.out.println("Enter the range : ");
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt() ;
		System.out.print( "Perfect number between 1 to " + n + " are " );
		for( int i = 1 ; i <= n ; i++ )
		{
			IsPerfectNumber( i ) ;
		}

	}
	
	static void IsPerfectNumber( int num )
	{
		int sum = 0 ;
		for( int i = 1 ; i < num ; i++ )
		{
			if( num % i == 0 )
			{
				sum += i;
			}	
		}
		System.out.print(( sum == num ) ? sum + ", " : "");
	}
}