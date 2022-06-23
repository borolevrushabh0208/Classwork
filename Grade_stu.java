import java.util.*;
class Grade_stu
 {
  
 	public static void main(String[]args)
	{
 
 		Scanner sc=new Scanner(System.in);
 
		System.out.println("Enter Physics marks : ");
			int p=sc.nextInt();
		System.out.println("Enter Chemistry : ");
			int ch=sc.nextInt();
		System.out.println("Enter Biology: ");
			int b=sc.nextInt();
	    System.out.println("Enter Mathematics : ");
			int m=sc.nextInt();
        System.out.println("Enter Computer : ");
			int com=sc.nextInt();

		 int ma = p+ch+b+m+com;
		 int t = (ma*100)/500;

	       if(t>=90)
			{
			  System.out.println("Grade A");
			}

				else if(t>=80)
				{
			 	   System.out.println("Grade B");
			    }

				else if(t>=70)
					{
					    System.out.println("Grade C");
			        }

				else if(t>=60)
						{
					   	  System.out.println("Grade D");
			            }

					else if(t>=40)
						{
						   System.out.println("Grade A");
			            }
							else
								System.out.println("Grade F");
        }
}