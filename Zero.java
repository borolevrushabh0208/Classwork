/* Q16. WAP to add multiple  number, ask user to take  input as their need.
	press 0 to terminate inputting after that calculate sum of that inputted number.*/

import java.util.*;

class Zero
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=1, sum = 0;
		System.out.print("\n\t\t\tEnter number : ");

		while(n!=0)
		{
			  n = sc.nextInt();
			sum = sum+n;
			
		}
			System.out.println("\n\t\t\tSum of all entered number is : " +sum);
	}
}
