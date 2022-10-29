import java.util.*;
class PowerOfProgram{
	public static void main(String[] args) {
		int base ;
		int power ;
		int n = 1;
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter the base value : ");
		base = sc.nextInt();
		System.out.print(" Enter the index value : ");
		power = sc.nextInt();
		for(int i = 1;  i<= power ;  i++ ){
			n*= base;
		} 
			System.out.print("The power of "+base+" raise to "+ power +" is "+n);
		
}
}









