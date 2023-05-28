
/*
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> d = new HashMap<>();

    for(int i=0; i<nums.length; i++){ 
        if(d.containsKey(nums[i])){
            d.put(nums[i], d.get(nums[i]) + 1);
        } else{
            d.put(nums[i], 1);
        }
    }
        int sum = 0;
        for(int key : d.keySet()){
            if(d.get(key) == 1){
            sum+=key;
            }
        }
        return sum;
    }
}  */