import java.util.*;
public class mountblue10 {
    public static int toys(List<Integer> w) {
      int count = 0;
        while(w.size() > 0){
            //System.out.println(w.size());
        int min = Integer.MAX_VALUE;
        for(int i=0; i<w.size(); i++){
            if(min > w.get(i)){
                min = w.get(i);
               
            }
        }
     //   System.out.println(min);
        for(int i=0; i<w.size(); i++){
             if(w.get(i) - min <= 4){
              System.out.println(w.get(i));
                 w.remove(Integer.valueOf(w.get(i)));
             }
        }
       // System.out.println(w);
        count++;
        }
        
       return count;     
    }
    public static void main(String[] args) {
        List<Integer> w = new ArrayList<>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(21);
        w.add(7);
        w.add(12);
        w.add(14);
        w.add(21);
        System.out.println(toys(w));
    }
}
   