
// Remove duplicates in a string
// abbccda  --> abcd

public class AdRecurrsion6 {
    public static boolean[] map = new boolean[26];       //array map of type boolean having size 26

    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a']==true){
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a']= true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args){
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}


 
/* 
 here 
 'a'-'a'=0
 'b'-'a'=1
 'c'-'a'=2
 so currChar -'a'= map index
 make boolean type array
 initally all char in map are false
 if anyone true means we got that char before as well
 

*/

 