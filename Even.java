// Q2.Display all even numbers from 1 to 100.

class Even
{
	public static void main(String[] args)
	{
		int n = 1;
		System.out.print("\n\t\t\tDisplaying Even number from 1 to 100");
		System.out.println("\n\t\t\t======================================");

		while(n<=100)
		{
			if(n%2==0)
				System.out.print(+n+" ");
			
		   n++;
		}
	}
}