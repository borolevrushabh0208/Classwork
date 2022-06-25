//Q8. Write a program to find the sum and count of all even numbers between 1 to n.

import java.util.*;
class EvenCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 1, c = 0, sum = 0;
		System.out.print("\n\t\t\tDisplaying Sum And Count Of Even Number");
		System.out.println("\n\t\t\t======================================");
		System.out.print("\n\t\t\tEnter last number upto which you want even number : ");
			int i = sc.nextInt();

		while(n<=i)
		{
			if(n%2==0)
			{
				sum = sum+n;
				c++;
			}
			
		   n++;
		}
			System.out.println("\n\t\t\tSum of all even number is : "+sum);
			System.out.println("\n\t\t\tCount of even number is : "+c);
	}
}