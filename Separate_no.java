 //WAP Input a number and separate it.
 import java.util.*;
 class Separate_no
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

         int rem,i;
         i=n;
         while(i!=0)
         {
            rem=i%10;
            System.out.print(" "+rem);
            i=i/10;
         }


    }
 }