import java.util.ArrayList;
import java.util.*;

public class mountblue {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
       ArrayList<Integer> map = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
           for(int j=i+1; j<arr.size(); j++){
               map.add(Math.abs(arr.get(i) - arr.get(j)));
        }
    }

        int min = 100;
            for(int k=0; k<map.size(); k++){
                //System.out.print(" "+map.get(k));
                if(min > map.get(k)){
                    min = map.get(k);
                    //System.out.println(min);
                }
            }
          return min;
}
    public static void main(String[] args){
          List<Integer> arr = new ArrayList<>();
          arr.add(6);
          arr.add(1);
          arr.add(2);
          arr.add(3);
          arr.add(4);
          arr.add(5);
          int result = minimumAbsoluteDifference(arr);
           System.out.println(result);
    }
}


/*public class mountblue{
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();
        for(int i=0; i<10; i++){
            no.add(i);
        }
         
         // Collections.sort(no);        
         //Collections.reverseOrder(no);        
         Collections.sort(no, Collections.reverseOrder());        
        
        System.out.print(" "+no);
        //System.out.println(list1);
        //System.out.println(list2);
    }
 } */