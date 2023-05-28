 
import java.util.*;
import java.util.Scanner;
//Write a program to accept a 4 digit number and
//a. Display face value of each decimal digit
//b. Display place value of each decimal digit
//c. Display no in reverse order by changing decimal place values
//If user enters a 4 digit number 9361 output should be
//a. 9 3 6 1
//b. 9361 = 9 000 + 300 + 60 + 9
//c. 1639


public class c2Twister{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int thousands=0;
        int hundreds=0;
        int tens=0;
        int ones=0;
        System.out.println("Face values as follows :");
        thousands=a/1000;
        a=a%1000;
        System.out.println(thousands);
        hundreds=a/100;
        a=a%100;
        System.out.println(hundreds);
        tens=a/10;
        a=a%10;
        System.out.println(tens);
        ones=a;
        System.out.println(ones);
        System.out.println("Reversed :");
        System.out.println(ones*1000+tens*100+hundreds*10+thousands);

    }
 }