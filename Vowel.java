//Q21.Wap enter an character and check it is vowel or not?

import java.util.*;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = 1;
		System.out.print("\n\t\t\tEnter any character : ");
			char ch = sc.next().charAt(0);
		System.out.println("\n\t\t\t=====================");

		while(n>0)
		{
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				System.out.println("\n\t\t\tEntered character is vowel");

			else
				System.out.println("\n\t\t\tEntered character is not vowel");
			
			n--;
		}
	}
}