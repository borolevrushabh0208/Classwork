// Q10.Display all odd numbers from 200 to 300.

class Odd200
{
	public static void main(String[] args)
	{
		int n = 200;
		System.out.print("\n\t\t\tDisplaying Odd number from 200 to 300");
		System.out.println("\n\t\t\t======================================");

		while(n<=300)
		{
			if(n%2==1)
				System.out.print(+n+" ");
			
		   n++;
		}
	}
}