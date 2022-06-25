//Q19.Write a progaram to check no is negative or possitive or zero.

import java.util.*;

class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int i= 1;
		System.out.print("\n\t\t\tEnter Number : ");
		  int n = sc.nextInt();

		while(i>0)
		{
			if(n>0)
				System.out.println("\n\t\t\tNumber Is Positive");
			
			else if(n<0)
				System.out.println("\n\t\t\tNumber Is Negative");

			else if(n==0)
				System.out.println("\n\t\t\tNumber Is Zero");
			i--;
		}
	}
}