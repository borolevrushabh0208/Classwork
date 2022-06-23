/*Q5:In boxing the weight class of a boxer is decided as per the following
     table. Write a program that receives weight as input and prints out
     the boxer’s weight class.
     Boxer Class
      Flyweight      < 115
      Bantamweight    115 - 121
	Featherweight   122 - 153
	Middleweight    154 – 189
	Heavyweight  >= 190*/


import java.util.*;

class Boxer_if
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.print("\t\tEnter weight= : ");
		int w = sc.nextInt();

			if(w<115)
			{
				System.out.println("\t\tFlyweight");
			}

			else if(w>=115 && w<=121)
			{
				System.out.println("\t\tBantamweight");
	    	     }

			else if(w>=122 && w<=153)
			{
				System.out.println("\t\tFeatherweight");
			}

			else if(w>=154 && w<=189)
			{
				System.out.println("\t\tMiddleweight");
			}

			else
				System.out.println("\t\tHeavyweight");
	}
}