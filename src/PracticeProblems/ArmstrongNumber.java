import java.util.*;
class ArmstrongNumber{
	public static void main(String[] args){
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt() ;
		int sum = 0 ;
		int org = num;
		int digit = 0 ;
		while( num > 0 ){
			digit = num % 10 ;
			sum += (digit*digit*digit) ;
			num = num / 10 ;
		}
		System.out.println(( org == sum )? org + " is an Armstrong Number ":org + " is not an Armstrong Number ");
	}
}