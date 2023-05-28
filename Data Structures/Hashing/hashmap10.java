 /*
 Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

The java string toCharArray() method converts the given string into a sequence of characters

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> d = new HashSet<>();

        for(char c : sentence.toCharArray()){
            d.add(c);
        }
        return d.size() == 26;
    }
}

  */