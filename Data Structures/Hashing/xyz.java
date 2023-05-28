 /*class Solution {
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
} */