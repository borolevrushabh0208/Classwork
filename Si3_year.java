/*WAP  calculate simple interest for 3 years , Amount rate and time inputted by user.

       Year :1 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)*/


import java.util.*;
class Si3_year
{
       public static void main(String[]args)
       {
              Scanner obj=new Scanner(System.in);
              System.out.println("Enter the amount");
              Double am=obj.nextDouble();
              System.out.println("Enter the rate");
              Double rt=obj.nextDouble();

              int i=1;
              while(i<=3)
              {
                     if(i==1)
                     {
                            System.out.println("year : 1");
                            Double si = (am * rt * 1)/100;
                            System.out.println("principal amount =:"+am);
                            System.out.println("rate of intress =:"+rt);
                            System.out.println("intrst Amount= "+si);
                            Double T = si+am;
                            System.out.println("Total payable amount= :"+T);         

                     }

                      else if(i==2)
                     {
                            System.out.println("year : 2");
                            Double si = (am * rt * 2)/100;
                            System.out.println("principal amount =:"+am);
                            System.out.println("rate of intress =:"+rt);
                            System.out.println("intrst Amount= "+si);
                            Double T = si+am;
                            System.out.println("Total payable amount= :"+T);
                            

                     }

                      else if(i==3)
                     {
                            System.out.println("year : 3");
                            Double si = (am * rt * 3)/100;
                            System.out.println("principal amount =:"+am);
                            System.out.println("rate of intress =:"+rt);
                            System.out.println("intrst Amount= "+si);
                            Double T = si+am;
                            System.out.println("Total payable amount= :"+T);
                            

                     }

                     i++;
              }



       }
}