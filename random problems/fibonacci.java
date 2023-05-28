 
 
 //Using For loop & While loop
//Write a program to display n terms of Fibonacci series
//Input: 6
//Output: 1, 1, 2, 3, 5, 8

import java.util.*;
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n<0){
        System.out.println("Invalid no.");
      }
      int f1=0,f2=1,sum=0;
      for(int i=1;i<=n;i++){
       sum=f1+f2;
      System.out.print(sum+",");
      f1=f2;
      f2=sum;
      }
      System.out.println(sum+",");
    }
}