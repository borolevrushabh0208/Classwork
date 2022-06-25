//Q9. Write a program to find the sum and count of all odd numbers between 1 to n.

import java.util.*;
class OddCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 1, c = 0, sum = 0;
		System.out.print("\n\t\t\tDisplaying Sum And Count Of Odd Number");
		System.out.println("\n\t\t\t======================================");
		System.out.print("\n\t\t\tEnter last number upto which you want odd number : ");
			int i = sc.nextInt();

		while(n<=i)
		{
			if(n%2==1)
			{
				sum = sum+n;
				c++;
			}
			
		   n++;
		}
			System.out.println("\n\t\t\tSum of all odd number is : "+sum);
			System.out.println("\n\t\t\tCount of odd number is : "+c);
	}
}