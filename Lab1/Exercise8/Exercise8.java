

 import java.util.Scanner;
 public class Exercise8
{
       public boolean checkNumber(int num)
       {
              boolean flag=false;
             
              if(num%2==0)
              {
                     int x=2;
                     int p=1;
                     lab:
                     while(true)
                     {
                           for(int i=1;i<=num/2;i++)
                           {
                                  p=p*x;
                                  if(p<num)
                                  {
                                         flag=false;
                                         continue;
                                  }
                                  else if(p==num)
                                  {
                                         flag=true;
                                         break lab;
                                  }
                                  else if(p>num)
                                  {
                                         flag=false;
                                         break lab;
                                  }
                           }
                     }
              }
              return flag;
       }
       public static void main(String[] ar)
       {
             Exercise8 ex=new Exercise8();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = s.nextInt();
              System.out.println("Power of 2: "+ex.checkNumber(num));
       }
}
