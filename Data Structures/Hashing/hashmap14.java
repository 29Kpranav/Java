/*
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> d = new HashSet<>();
        
        for(char c : allowed.toCharArray()){
            d.add(c);
        }

        int count = 0;
        Boolean flag = true;
        for(String str : words){
            flag = true;
            for(char s : str.toCharArray()){
                if(!d.contains(s)){
                    flag = false;
                }
            }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
}

*/