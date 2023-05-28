import  java.util.*;

public class mountblue3 {
     public static int theLoveLetterMystery(String s) {
        int count = 0;
        int n = 0;
        if(s.length() % 2 == 0){
             n = s.length()/2;
        }else{
             n = s.length()/2 + 1;
        }
        
       
        String p = s.substring(0, n-1);
       // System.out.println(p);
         
        String q = s.substring(n);
       // System.out.println(q);
      // System.out.println(p.length()+" "+p.charAt(0)+" "+q.charAt(0));
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == q.charAt(p.length()- i -1)){
               // System.out.println(p.charAt(i)+" "+q.charAt(i));
                continue;
            }else{
                int sum = Math.abs(p.charAt(i) - q.charAt(i));
               // System.out.println(sum);
                count += sum;
            }
        }
         
       return count;
       
    }
    public static void main(String[] args) {
        String s = "abc";
       int a = theLoveLetterMystery(s);
       System.out.println(a);
    }
}
