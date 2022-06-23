/*(2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small*/

import java.util.*;
class Cap_small
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
	

		System.out.println("\t\tEnter any character :");
		char ch=obj.next().charAt(0);
		System.out.println("\t\t  ");
		if(ch >= 65 && ch <= 90)
		{
			System.out.println("\t\tit is capital character");
		}

		else if(ch >= 97 && ch <=122)
		{
			System.out.println("\t\tit is a small letter :");
		}

		else if(ch >=48 && ch <= 57)
		{
			System.out.println("\t\tit is digit :");
		}

		else if (ch>=0 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=127)
			{
				System.out.println("\t\tit is a speacial symbol");
			}

	}
}