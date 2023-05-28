//Number of Steps to Reduce a Number to Zero

/*Example 1:

Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0. */

import java.util.*;
public class leetcode8 {
    public static int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num=num/2 ;
                count++ ;
            }else{
                num=num-1 ;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    int result= numberOfSteps(num);
    System.out.println(result);
    }
}
