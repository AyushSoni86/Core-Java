import java.util.*;
class PrimeOrNot
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);	
		int num = sc.nextInt();
		boolean flag = true;
		
		for(int i = 2; i<= num/2 ; i++)
		{
			 if( num % i == 0 )
			{
				flag = false;
			}
		}
		System.out.println((flag==true)? num + " is a Prime Number " : num + " is not a Prime Number ");		
	}
}