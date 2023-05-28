/*Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. */



import java.lang.*;
import java.util.Scanner;
class leetcode9
{  
    public static int[] runningSum(int[] nums) 
    {
        int[] res= new int[nums.length];        //key to succes.
        if(nums.length==0) return res;
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res[i]=res[i-1]+ nums[i];
        }
        return res;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
             nums[i]=sc.nextInt();
        }
        int res[]= runningSum(nums);
        System.out.print("[");
        for(int j=0;j<res.length;j++) 
        System.out.print(res[j]+",");
        System.out.println( "]");
        
    }
}