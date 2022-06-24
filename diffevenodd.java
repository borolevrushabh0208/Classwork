 //WAP find the difference between even and odd number  from 201 to 400;
class diffevenodd
{
    public static void main(String[]args)
    {
    int i= 201 ;
    int sum = 0;
    int count = 0;
    int flag = 0; 
    int s = 0;
        while(i<=400)
        {
            if(i%2==0)
            {
                sum = sum + i;
                count++;
            }
            else 
            {
                s = s + i;
                flag++;
            }
            i++;
         }
            System.out.println("\t\t\t\tTotal Even Number = "+sum);
            System.out.println("\t\t\t\tTotal Odd Number = "+sum);
            int diff = sum-s;
            System.out.println("\t\t\t\tDifference = "+diff);
            System.out.println("\t\t\t\tTotal Even Number = "+count);
            System.out.println("\t\t\t\tTotal Odd Number = "+flag);

       } 
}