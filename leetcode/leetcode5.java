//Count Operations to Obtain Zero

//Input: num1 = 2, num2 = 3
//Output: 3
//Explanation: 
//- Operation 1: num1 = 2, num2 = 3. Since num1 < num2, we subtract num1 from num2 and get num1 = 2, num2 = 3 - 2 = 1.
//- Operation 2: num1 = 2, num2 = 1. Since num1 > num2, we subtract num2 from num1.
//- Operation 3: num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from num1.
//Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any further operations.
//So the total number of operations required is 3.

import java.util.Scanner;
import java.util.*;
class leetcode5 {
    public static void countOperations(int num1, int num2) {
    //if(num1==0||num2==0){
      //   return o;
    //}  
    int count = 0;
    while(num1 != 0 && num2 != 0){ 
        //as when any one number becomes 0 we have to end it there otherwise it will go to infinite loop as num2-0=num2 and same for num1 case.
    if(num1 > num2)
    num1 -= num2;
    else
    num2 -=num1;
    count++;
    }
    System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        countOperations(num1, num2);
    }
}
