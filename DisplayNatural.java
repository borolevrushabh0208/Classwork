// Q3. Write a program to print all natural numbers from 1 to n. - using while loop

class DisplayNatural
{
	public static void main(String[] args)
	{
		int n = 1;
		System.out.print("\n\t\t\tDisplaying natural number from 1 to 200");
		System.out.println("\n\t\t\t=====================================");

		while(n<=200)
		{
			System.out.print(+n+" ");
			n++;
		}
	}
}