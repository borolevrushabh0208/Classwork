//10.Write a Java program to input angles of a triangle and check whether triangle is valid or not.
import java.util.*;
class Trangle_valid
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the first triangle");
		int a1=obj.nextInt();

		System.out.println("Enter the Second triangle");
		int a2=obj.nextInt();

		System.out.println("Enter the third triangle");
		int a3=obj.nextInt();

		 int triangle = a1+a2+a3;
		 if(triangle==180)
		 	System.out.println("is a valid trangle");

		 else 
		 	System.out.println("is not valid triangle");

	}
}