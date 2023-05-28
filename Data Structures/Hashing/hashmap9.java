 /*class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> d = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            d.put(nums[i], i);
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
        int target = diff + nums[i];
        if(d.containsKey(target)){
           int x = diff + target;
           if(d.containsKey(x)){
               count++;
            } 
            }
        }
        return count;
    }
} */

//2367. Number of Arithmetic Triplets