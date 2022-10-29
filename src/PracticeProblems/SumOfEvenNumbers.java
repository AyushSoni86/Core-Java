import java.util.*;
class SumOfEvenNumbers{
public static void main(String[] args){
	System.out.print("Enter the number : ");
	Scanner sc = new Scanner(System.in);	
	int num = sc.nextInt();
	int sum = 0;
	for(int i = 0; i<= num ; i++){
		if( i % 2 == 0)
		  sum = sum + i;
		}
		System.out.println("The sum is "+sum);

}
}