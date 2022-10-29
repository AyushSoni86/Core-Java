import java.util.*;
class PerfectNumber{
	public static void main( String[] args ){
		int num ;
		System.out.println("Enter the Number : ") ;
		Scanner sc = new Scanner(System.in) ;
		num = sc.nextInt() ;
		//int i = 0 ;
		int sum = 0 ;
		for ( int i = 1 ; i <= num / 2 ;  i++ ){
			if( num % i == 0 ){
				sum += i ;
			}
		}
			System.out.println((num==sum)?num + " is a perfect number " : num +  " is not a perfect number ");
			
		
}
}