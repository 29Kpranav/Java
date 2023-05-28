import java.util.*;
public class  mountblue5{
    public static int luckBalance(int k, List<List<Integer>> contests) {
      int sum = 0;
        HashMap<Integer, Integer> x = new HashMap<>();
        ArrayList<Integer> x1 = new ArrayList<>();
        
        for(int i=0; i<contests.size(); i++){
            x.put(contests.get(i).get(i), contests.get(i).get(i+1));
            if(x.get(i) == 1){
            x1.add(contests.get(i).get(i));
            }
        }
        System.out.println(x);
         System.out.println(x1);
        Collections.reverse(x1);
        int sum1 = 0;
        for(int j=0; j<k; j++){
            sum1 += x1.get(j);
        }
        for(int i=0; i<x.size(); i++){
            if(x.get(contests.get(i)) == 0){
                sum += contests.get(i).get(i);
            }
        }
        
        int answer = sum1 + sum;
        return answer; 
    }
    public static void main(String[] args) {
        List<List<Integer>> contests = new List<List<Integer>>();
            x.get(0).add(5);
            x.get(0).add(1);
            x.get(1).add(2);
            x.get(1).add(1);
            x.get(2).add(1);
            x.get(2).add(1);
            x.get(3).add(8);
            x.get(3).add(1);
            x.get(4).add(10);
            x.get(4).add(0);
            x.get(5).add(5);
            x.get(5).add(0);

           int sumx = luckBalance(3, contests);
           System.out.println(sumx);
    }
    
}
