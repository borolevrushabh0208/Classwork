/*(6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.
(2) Whether a character entered through the keyboard is a special
symbol or not.*/

import java.util.*;
class Alphabet_symbol
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\t\tEnter cheracter here");
		char ch = obj.next().charAt(0);

		if(ch>='a'  &&  ch<='z')
		{
		  System.out.println("\t\tcharecter is lowercase alphabet..");
		}

		 else if(ch>='A'  &&  ch<='Z')
		 {
		   	System.out.println("\t\tit is not lowercase");
		 }
		  
		   
		 else if ((ch>=0 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))
			{
				System.out.println("\t\tit is a speacial symbol");
			}

			else 
				System.out.println("\t\tEnter right character or Symbol");
		
	}
}

