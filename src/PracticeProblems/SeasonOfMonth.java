import java.util.*;
public class SeasonOfMonth{
	public static void main(String[] args){
		String season;
		System.out.println("Enter any month from 1 to 12");
		Scanner sc = new Scanner(System.in);
		int month=sc.nextInt();
		
		switch(month){

			case 12:
			case 1:
			case 2:season = "Winter";
				break;
			case 3:
			case 4:
			case 5:season = "Spring";
				break;
			case 6:
			case 7:
			case 8:season = "Winter";
				break;
			case 9:
			case 10:
			case 11:season = "Summer";
				break;
			default:
				season = "Tu ludo khel beta ";

			}
				System.out.println("The entered month is in the " + season);	
		
}
}