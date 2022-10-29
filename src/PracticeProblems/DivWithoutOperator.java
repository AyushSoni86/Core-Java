import java.util.* ;
class DivWithoutOperator
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in ) ;
		int count = 0 ;
		System.out.println("Enter the number ") ;
		int num1 = sc.nextInt() ;
		System.out.println("Enter the number you want to divide "+ num1 + " with : ") ;
		int num2 = sc.nextInt() ;
		while( num1 > 0 && num1 < num2 )
		{
			num1 -= num2 ;
			count++;

		}
	}
}