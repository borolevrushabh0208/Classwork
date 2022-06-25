// Q17.Wap to take input a no and print table.

import java.util.*;
class Table17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = 1;
		System.out.println("\n\t\t\tTABLE");
		System.out.println("\n\t\t\t=========");
		System.out.print("\n\t\t\tEnter number to print table of it : ");
			int n = sc.nextInt();
		System.out.println("\n\t\t\t============================================");
		while(t<=10)
		{
			System.out.print("\t" +n*t+" ");
			
			t++;
		}

		
	}
}