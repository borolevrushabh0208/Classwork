//Q20.Take two int values from user and print greatest among them.

import java.util.*;

class Greatest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int j = 1;
		System.out.print("\n\t\t\tEnter First Number : ");
		int n = sc.nextInt() ;
		System.out.print("\n\t\t\tEnter Second Number : ");
		int i = sc.nextInt();

		while(j>0)
		{
			if(n>i)
				System.out.println("\n\t\t\tFirst Number Is Greatest : " +n);
			
			else if(n<i)
				System.out.println("\n\t\t\tSecond Number Is Greatest :  " +i);

			j--;
		}
	}
}