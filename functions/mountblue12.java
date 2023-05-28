import java.util.*;

public class mountblue12 {
    public static int makingAnagrams(String s1, String s2) {

        ArrayList<Character> x1 = new ArrayList<>();
        for(char c: s1.toCharArray()){
            x1.add(c);
        }
        System.out.println(x1);
        ArrayList<Character> x2 = new ArrayList<>();
        for(char c: s2.toCharArray()){
            x2.add(c);
        }
        System.out.println(x2);
        for(int i=0; i<x1.size(); i++){
            for(int j=0; j<x2.size(); j++){
                if(x1.get(i) == x2.get(j)){
                    x1.remove(i);
                    x2.remove(j);
                }
            }
        }
        System.out.println(x1);
        System.out.println(x2);
        return x1.size()+x2.size();
    }
    public static void main(String[] args) {
        String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
        String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
        int x = makingAnagrams(s1, s2);
        System.out.println(x);
         
    }
}







/*public static int makingAnagrams(String s1, String s2) {
        HashSet<Character> x = new HashSet<>();
        HashMap<Character, Integer> ans = new HashMap<>();
        for(char c : s1.toCharArray()){
            x.add(c);
            if(ans.containsKey(c)){
                ans.put(c, ans.get(c)+1);
            }else {
                ans.put(c, 1);
            }
        }
        for(char c : s2.toCharArray()){
            x.add(c);
            if(ans.containsKey(c)){
                ans.put(c, ans.get(c)+1);
            }else {
                ans.put(c, 1);
            }
        }
        System.out.println(ans);
        System.out.println(x);
         int count = 0;
        for(char c : x){
            if(ans.get(c) % 2 != 0){
                count++;
            }
        }
        return count; */