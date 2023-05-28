import java.util.*;
class function8{
    public static int minimumDistances(List<Integer> a) {
        HashSet<Integer> ans = new HashSet<>();
          HashMap<Integer, Integer> ok = new HashMap<>();
          HashMap<Integer, Integer> ok1 = new HashMap<>();
          for(int i=0; i<a.size(); i++){
              for(int j=0; j<a.size(); j++){
                  if(a.get(i) == a.get(j)){
                      ans.add(a.get(i));
                  }
              }
          }
          
          for(int i=0; i<a.size(); i++){
              if(ans.contains(a.get(i))){
                      if(!ok.containsKey(a.get(i))){
                          ok.put(a.get(i), i);
                      }else {
                          ok1.put(a.get(i), i);
                      }
              }
          }
          
          int[] mc = new int[ok.size()];
          for(int i=0; i<ok.size(); i++){
              mc[i] = ok1.get(i) - ok.get(i);
          }
          int min = Integer.MAX_VALUE;
          for(int i=0; i<mc.length; i++){
              if(min > mc[i]){
                  min = mc[i];
              }
          }
        return min;
      }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(7);

        int a  = minimumDistances(arr);
        System.out.println(a);
    }
  }