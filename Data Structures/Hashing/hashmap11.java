 
 /*Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 
 class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        HashMap<Integer,Integer>mp=new HashMap<>();

        int[] ans=new int[nums.length];

        int index=0;

        int[]copy=Arrays.copyOf(nums,nums.length);

        Arrays.sort(copy);

        for(int i=0;i<copy.length;i++){
        
        if(!mp.containsKey(copy[i])){
            mp.put(copy[i],i);          
        }

        }

        for(int i=0;i<nums.length;i++){
       
        ans[index++]=mp.get(nums[i]);
       
        }

    return ans;   
    
    }
} */


/*class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int copy[] = nums.clone();

        Arrays.sort(copy);

        for(int i=0; i<nums.length; i++){
              map.putIfAbsent(copy[i], i);
        }

        for(int i=0; i<nums.length; i++){
            
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }
} */