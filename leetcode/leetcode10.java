
/*Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2). */

import java.util.Scanner;
class leetcode10{
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
            if(j!=i && nums[j]<nums[i])
                count++;
                res[i]=count;
        }
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
        int res[]= smallerNumbersThanCurrent(nums);
        System.out.print("[");
        for(int j=0;j<res.length;j++) System.out.print(res[j]+",");
        System.out.println("]");
        
    }
}