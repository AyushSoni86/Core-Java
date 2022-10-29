import java.util.*;
class SumOfDigits{
	public static void main(String[] args){
		int num ;
		int digit ;
		int sum = 0;
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while( num > 0 ){
			digit = num % 10 ;
			sum += digit ;
			num = num / 10 ;
			 
			
		}
		System.out.println(sum);	
	
	}
}