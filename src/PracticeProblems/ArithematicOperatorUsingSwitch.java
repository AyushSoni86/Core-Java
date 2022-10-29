import java.util.Scanner;
public class ArithematicOperatorUsingSwitch
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Enter the operator : ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case '+': c=a+b;
				System.out.println(c);
				break;

			case '-': c=a-b;
				System.out.println(c);
				break;

			case '*': c=a*b;
				System.out.println(c);
				break;

			case '/': c=a/b;
				System.out.println(c);
				break;

			case '%': c=a%b;
				System.out.println(c);
				break;

			default:
				System.out.println(" INVALID ! :( ");
				break;
		}		
	}
}