/* 1 The current year and the year in which the employee joined the organization are entered through the keyboard.
If the number of years for which the employee has served the organization is greater than 3, then a bonus of Rs. 2500/- is given to the employee.
If the years of service are not greater than 3, then the program should do nothing. */

import java.util.*;

class Bonus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\t\t\tEnter your joining year : ");
			int year = sc.nextInt();

		int n = 2025;
		
		if(year>n)
		{
			System.out.println("\t\t\t============================================");
			System.out.println("\t\t\tYou are elegible for the bonus of Rs. 2500/-");
		}
	}
}