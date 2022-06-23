/*(1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||.*/
import java.util.*;
class Year_logical
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("\t\tEnter the year :");
		int year=obj.nextInt();

		System.out.println("\t\t :");

		if((year%4==0 || year%400==0) && (year%100!=0))
    	{
    		System.out.println("\t\tyear is leap year :");
    	}

    	else 
    		System.out.println("\t\tthis is not leap year :");

	}//main

}




