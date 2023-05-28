import java.util.*;
public class mountblue4 {
    public static int jumpingOnClouds(List<Integer> c) {
        
        int count = 0;
        for(int x = 0; x < c.size(); x++){
            
            if(c.get(x) == 1){
                continue;
            }else if(c.get(x) == 0){
                if(c.get(x+1) == 0 && x+1 < c.size()){
                    count++;
                    x = x+1;
                }else{
                    count++;
                }
            }
        }
return count;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
         a.add(0);
         a.add(1);
         a.add(0);
         a.add(0);
         a.add(1);
         a.add(0);
        int x = jumpingOnClouds(a);
        System.out.println(x);
    }
}
