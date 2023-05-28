
//Write a program to accept a 5 digit number and check whether it is 
//a numeric palindrome. (If reversed number is same as entered 
//number it is called palindrome).

import java.util.*;
public class pilindrome {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int r,sum=0,temp;
    temp=num;
    while(num>0)
    {
     r=num%10;   //give last digit
     sum=(sum*10)+r;
     num=num/10;   //delete last digit
    }
    if(temp==sum){
        System.out.println("Given no. is p.");
    }else {
        System.out.println("No");
    }
    }
}
