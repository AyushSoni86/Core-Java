import java.util.* ;
class MultWithoutOperator
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in ) ;
		System.out.print(" Enter the number : ") ;
		int sum = 0 ;
		int num1 = sc.nextInt() ;
		System.out.print(" Enter the number you want to multiply " + num1 + " with : ") ;
		int num2 = sc.nextInt() ;
		for( int i = 1 ; i <= num2 ; i++ )
		{
			sum += num1 ;
		}
		System.out.println("The Multiplication of "+ num1 +" and "+ num2 +" is "+ sum);	
	}	
}