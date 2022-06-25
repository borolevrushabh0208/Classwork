/* 3:  The marks obtained by a student in 5 different
subjects are input through the keyboard. The student gets a division as per the
following rules: 
			Percentage above or equal to 60 - First division Percentage
			between 50 and 59 - Second division 
			Percentage between 40 and 49 - Third division
			Percentage less than 40 – Fail 
Write a program to calculate the division obtained by the student
		 =========================Student Record===========================
		  	  Name  Roll No Phy Chem Math English Regional Language
*/

import java.util.*;

class StudentRecord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("\n\t\t\tEnter Student Marks");
		System.out.println("\n\t\t\t===================");
		System.out.print("\n\t\t\tName : ");
			String Name = sc.nextLine();
		System.out.print("\n\t\t\tRoll No : ");
			int Rn = sc.nextInt();
		System.out.print("\n\t\t\tPhysics : ");
			int Phy = sc.nextInt();
		System.out.print("\n\t\t\tChem : ");
			int Chem = sc.nextInt();
		System.out.print("\n\t\t\tMath : ");
			int Math = sc.nextInt();
		System.out.print("\n\t\t\tEnglish : ");
			int Eng = sc.nextInt();
		System.out.print("\n\t\t\tRegional Language : ");
			int RL = sc.nextInt();

		int Percent = ((Phy+Chem+Math+Eng+RL)*100)/500;		//Percentage
		if(Percent>=60)
		{
			System.out.println("\n\t\t\t=========================Student Record===================================");
			System.out.println("\n\t\t\tName   \tRoll No  Phy    Chem   Math  English Regional-Language");
			System.out.print("\n\t\t\t"+Name+"\t"+Rn+"\t"    +Phy+"\t"  +Chem+"\t"  +Math+"\t" +Eng+"\t"    +RL);
			System.out.println("\n\n\t\t\tYour Percentage are : " +Percent);
			System.out.println("\n\t\t\tFirst Division");
		}

		else if(Percent>=50 && Percent<=59)
		{
			System.out.println("\n\t\t\t=========================Student Record===========================");
			System.out.println("\n\t\t\tName   \tRoll No  Phy    Chem   Math  English Regional-Language");
			System.out.print("\n\t\t\t"+Name+"\t"+Rn+"\t"    +Phy+"\t"  +Chem+"\t"  +Math+"\t" +Eng+"\t"    +RL);
			System.out.print("\n\t\t\t"+Name+   +Rn+   +Phy+  +Chem+ +Math+   +Eng+      +RL);
			System.out.println("\n\n\t\t\tYour Percentage are : " +Percent);
			System.out.println("\n\t\t\tSecond Division");
		}

		else if(Percent>=40 && Percent<=49)
		{
			System.out.println("\n\t\t\t=========================Student Record===========================");
			System.out.println("\n\t\t\tName   \tRoll No  Phy    Chem   Math  English Regional-Language");
			System.out.print("\n\t\t\t"+Name+"\t"+Rn+"\t"    +Phy+"\t"  +Chem+"\t"  +Math+"\t" +Eng+"\t"    +RL);
			System.out.println("\n\n\t\t\tYour Percentage are : " +Percent);
			System.out.println("\n\t\t\tThird Division");
		}


		else if(Percent<40)
		{
			System.out.println("\n\t\t\t=========================Student Record===========================");
			System.out.println("\n\t\t\tName   \tRoll No  Phy    Chem   Math  English Regional-Language");
			System.out.print("\n\t\t\t"+Name+"\t"+Rn+"\t"    +Phy+"\t"  +Chem+"\t"  +Math+"\t" +Eng+"\t"    +RL);
			System.out.println("\n\n\t\t\tYour Percentage are : " +Percent);
			System.out.println("\n\t\t\tFail");
		}


	}
}
