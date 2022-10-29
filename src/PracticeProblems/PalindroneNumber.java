import java.util.*;
class PalindroneNumber{
	public static void main(String[] args){
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in) ;
		int num = sc.nextInt() ;
		int rev = 0 ;
		int org = num ;
		int digit = 0 ;
		while( num > 0 ){
			digit = num % 10 ;
			rev += ( digit * 10 ) ;
			num = num / 10 ;
		}
		System.out.println(( org == rev )? 
				org + " is a Palindrone Number "
					:org + " is not an Palindrone Number ");
	}
}