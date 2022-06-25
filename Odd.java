//Q6. Write a program to print all odd number between 1 to 100.

class Odd
{
	public static void main(String[] args)
	{
		int n = 1;
		System.out.print("\n\t\t\tDisplaying Odd number from 1 to 100");
		System.out.println("\n\t\t\t======================================");

		while(n<=100)
		{
			if(n%2==1)
				System.out.print(+n+" ");
			
		   n++;
		}
	}
}