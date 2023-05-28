
// Find Greatest Common Divisor of min. & max. Array

import java.util.*;
import java.util.Scanner;
public class leetcode6 {

    static void getGcd(int min ,int max ){
     
        for(int i=1;i<=min && i<=max;i++){
            if(min%i==0 && max%i==0){
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int nums[]= new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
         
            int min = nums[0];
            for(int i = 0; i<size; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int max = nums[0];
            for(int i = 0; i<size; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        //System.out.println(min);
        //System.out.println(max);

        getGcd(min,max);
        
    }
}




 /*
  class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
    
    int gcd(int a, int b) {
        if (a == 0){
            return b;    
        } else if (b == 0) {
            return a; 
        } else if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a-b, b);
        } else {
            return gcd(a, b-a);
        }
    }
}
  */