// Q7. Write a program to find sum of all natural numbers between 1 to n.

import java.util.*;
class SumNatural
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 1, sum = 0;
		System.out.print("\n\t\t\tSum of natural number");
		System.out.println("\n\t\t\t=============================================");
		System.out.print("\n\t\t\tEnter last number upto which you want sum : ");
			int i = sc.nextInt();
		System.out.println("\n\t\t\t=============================================");

		while(n<=i)
		{
			sum=sum+n;
			
		  n++;
		}
				System.out.print("\n\t\t\tYour Sum is : " +sum);
	}
}