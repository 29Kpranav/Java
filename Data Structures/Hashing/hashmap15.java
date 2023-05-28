 /*
 2103
 
 Input: rings = "B0B6G0R6R0R6G9"
Output: 1
Explanation: 
- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
- The rod labeled 6 holds 3 rings, but it only has red and blue.
- The rod labeled 9 holds only a green ring.
Thus, the number of rods with all three colors is 1.

Input: rings = "B0R0G0R9R0B0G0"
Output: 1
Explanation: 
- The rod labeled 0 holds 6 rings with all colors: red, green, and blue.
- The rod labeled 9 holds only a red ring.
Thus, the number of rods with all three colors is 1.
 
 
 class Solution {
    public int countPoints(String rings) {
        HashMap<Character,Set<Character>> ms = new HashMap<>();

        for(int i=1;i<rings.length();i+=2){
            if(!ms.containsKey(rings.charAt(i))){
                ms.put(rings.charAt(i),new HashSet<Character>());
            }
            ms.get(rings.charAt(i)).add(rings.charAt(i-1));
        }
        int count=0;
        for(char s:ms.keySet()){
            if(ms.get(s).size()==3)
            count++;
        }
        return count;
    }
} */