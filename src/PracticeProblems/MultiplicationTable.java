import java.util.*;
class MultiplicationTable{
public static void main(String[] args){
	System.out.print("Enter the Table number you want : ");
	Scanner sc = new Scanner(System.in);	
	int num = sc.nextInt();
	int mul = 1;
	System.out.println("The Table is ");
	for(int i = 1; i<= 10 ; i++){
		 mul = num * i ;
		System.out.println(num+" x "+ i +" = "+ mul);
		}
		

}
}