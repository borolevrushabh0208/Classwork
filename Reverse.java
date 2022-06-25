// Q4. Write a program to print all natural numbers in reverse (from n to 1). - using while loop

class Reverse
{
	public static void main(String[] args)
	{
		int i = 20;
		int n = 1;
		System.out.print("\n\t\t\tDisplaying natural number from 1 to 10 in reverse");
		System.out.println("\n\t\t\t=================================================");

		while(i>=n)
		{
			System.out.print(+i+" ");
			i--;
		}
	}
}