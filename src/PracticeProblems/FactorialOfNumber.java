import java.util.*;
class FactorialOfNumber{
public static void main(String[] args){
	System.out.print("Enter the number : ");
	Scanner sc = new Scanner(System.in);	
	int num = sc.nextInt();
	int fact = 1;
	System.out.print("The Factorial of "+num +" is ");
	for(int i = 1; i<= num ; i++){
		 fact = fact * i ;
		
		}
		System.out.println(fact);

}
}