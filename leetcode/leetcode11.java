
/* 1295 find eve no. of digits
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits. */

import java.util.Scanner;
class Solution {
    static int numberOfDigits(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        return cnt;
    }
    static int findNumbers(int[] nums)
    {
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++)
            if(numberOfDigits(nums[i]) % 2 == 0)
                result++;
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
             nums[i]=sc.nextInt();
        }
        int res=  findNumbers(nums);
        System.out.println(res); 
    }
}