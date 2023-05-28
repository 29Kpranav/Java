
//Check leap year or not using conditional operator in java
 
import java.util.Scanner;
public class leapYear 
{
   public static void main(String[] args) 
   {
      long number, year, a;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter any year :");
      year = sc.nextLong();        
      if(year != 0)
      {
         number = (year % 400 == 0)?(a = 1):((year % 100 == 0)?(a = 0):((year % 4 == 0)?(a = 1):(a = 0)));      //a=0 is default..
         if(number == 1)
         {
            System.out.println(year + " is a leap year");
         }
         else
         {
            System.out.println(year + " is not a leap year");
         }
      }
      else
      {
         System.out.println("year zero does not exist ");
      }
       //sc.close();
   }
}