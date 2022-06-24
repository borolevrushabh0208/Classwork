 //find the sum of a number 34567834;
class Sum3456
{
    public static void main(String[]args)
    {
    long n = 34567834;
    long i, rem,sum=0l;
    i=n;

    while(i!=0)
    {
        rem=i%10;
        sum=sum+rem;
        i=i/10;
    }

    System.out.println(" "+sum);
   }
}