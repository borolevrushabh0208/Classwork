class Sumofsqu
{
  public static void main(String[]args)
  {
   
    System.out.println("\t\t\tnumber\tsquare");
     int i=1,sum=0;
     while(i<=10)
     {
         int sq = i*i;
         System.out.println("\t\t\t"+i+"       "+sq);
         sum= sum+sq;
         i++;    
     }
        System.out.println("\t\t\tTotal\t"+sum);
  }
}
