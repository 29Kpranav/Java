 /*class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> d = new HashMap<>();
        for(int i=0; i<names.length; i++){
            d.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int x = 0;
        String array[] = new String[names.length];
        for(int j = heights.length-1; j>=0; j--){
         array[x++] = d.get(heights[j]);
        }
        return array;
    }
} 

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

*/