//Write a program to accept integer values of base and index and calculate 
//power of base to index. Write logic in user defined power() function.
//Pass base & index to function and return result from function.
//Input: base: 2 index: 5
//Output: 32
//Input: base: 8 index: 3
//Output: 51

import java.util.*;
public class pow{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int index=sc.nextInt();
    int result=1;
    for(int i=1;i<=index;i++){
        result=result*base;
    }
    System.out.println(result);
    }
    }

