//7 Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.
import java.util.*;
class Triangle_check
{
	public static void main(String[]args)
	{
	 Scanner obj=new Scanner(System.in);
	 System.out.print("\t\tEnter the first side= ");
			int a = obj.nextInt();

	System.out.print("\t\tEnter the second side= ");
			int b = obj.nextInt();

	System.out.print("\n\nEnter the third side= ");
			int c = obj.nextInt();

	if(a<b+c && b<a+c && c<a+b)
	{
		if(a==b && b==c)
		{
			System.out.println("\t\ttriangle is equlateral");
		}
			else if(a==b || b==c || c==a)
			{
				System.out.println("\t\ttriangle is isosceles");
			}

			else 
				System.out.println("\t\ttriangle is scalene");
	}
			else 
				System.out.println("\t\tit is not found");

	}
}