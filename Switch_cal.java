
import java.util.*;
class Switch_cal
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);

		System.out.println("\t\t+. Addition");
        System.out.println("\t\t-. Subtraction");
        System.out.println("\t\t*. Multiplication");
        System.out.println("\t\t/. Division");
        	System.out.println("\t\t\t\t");

		System.out.print("\t\tenter your choice : ");
		char choice=obj.next().charAt(0);

		
	switch(choice)
     {
		case '+':
		{
		   
	   		System.out.println("Enter your first number");
	   	    int a=obj.nextInt();
	   		System.out.println("Enter your second number");
	   		int b=obj.nextInt();
	   		int c=b+a;
	   		System.out.println("two number addition..."+c);
	   		break;
	   	}

	   case '-':
	   	{
		   
	   		System.out.println("Enter your first number");
	   	    int c=obj.nextInt();
	   		System.out.println("Enter your second number");
	   		int d=obj.nextInt();
	   		int e=c-d;
	   		System.out.println("two number addition..."+e);
	   		break;
	   	}
		
		case '*':
			{
		   
	   		System.out.println("Enter your first number");
	   	    int e=obj.nextInt();
	   		System.out.println("Enter your second number");
	   		int f=obj.nextInt();
	   		int g=e*f;
	   		System.out.println("two number addition..."+g);
	   		break;
	   	}

	   case '/':
	   	{
		   
	   		System.out.println("Enter your first number");
	   	    float g=obj.nextFloat();
	   		System.out.println("Enter your second number");
	   		float h=obj.nextFloat();
	   		float z=g/h;
	   		System.out.println("two number addition..."+z);
	   		break;
	   	}
	   default:
	   	    System.out.println("enter valid choice");

	  }//switch body
	}
}//class