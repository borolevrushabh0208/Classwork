/* 4: A company insures its drivers in the following cases:

− If the driver is married.
− If the driver is unmarried, male & above 30 years of age.
− If the driver is unmarried, female & above 25 years of age.

In all other cases, the driver is not insured. If the marital status, sex, and age of the driver are the inputs,
write a program to determine whether the driver is to be insured or not. */


import java.util.*;

class Insure
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\t\t\tMarital Status : ");
			char Mar = sc.next().charAt(0);
		System.out.print("\n\t\t\tGender : ");
			char Gen = sc.next().charAt(0);
		System.out.print("\n\t\t\tAge : ");
			int Age = sc.nextInt();

		if(Mar=='m')
			System.out.println("\n\t\t\tDriver is insured");

		else if((Mar=='u' && Gen=='m') && Age>30)
			System.out.println("\n\t\t\tDriver is insured");

		else if((Mar=='u' && Gen=='f') && Age>25)
			System.out.println("\n\t\t\tDriver is insured");

		else
			System.out.println("\n\t\t\tDriver is not insured");

	}
}