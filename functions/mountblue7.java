 import java.util.*;
 class mountblue7{
 public static String funnyString(String s) {
       ArrayList<Integer> ans = new ArrayList<>();
          ArrayList<Integer> ans1 = new ArrayList<>();
        
        for(char xx : s.toCharArray()){
            int x = xx;
            ans.add(x);
        }
        System.out.println(ans);
        for(int i=ans.size()-1; i>=0; i--){
            ans1.add(ans.get(i));
        }
        System.out.println(ans1);
        ArrayList<Integer> vv = new ArrayList<>();
        for(int i=0; i<ans.size()-1; i++){
            int y = Math.abs(ans.get(i) - ans.get(i+1));
            vv.add(y);
        }
        System.out.println(vv);
        ArrayList<Integer> vv1 = new ArrayList<>();
        for(int i=0; i<ans1.size()-1; i++){
            int y = Math.abs(ans1.get(i) - ans1.get(i+1));
            vv1.add(y);
        }
        System.out.println(vv1);
        for(int i=0; i<vv.size(); i++){
            if(vv.get(i) == vv1.get(i)){
                continue;
            }else {
                return "Not Funny";
            }
        }
return "Funny";
    }
    public static void main(String[] args) {
        String s = "bcxz";
        String x = funnyString(s);
        System.out.println(x);
    }
}
