 
 import java.util.*;
 class mountblue8{
 public static ArrayList<Integer> cutTheSticks(ArrayList<Integer> arr) {
        int min = 500; 
         ArrayList<Integer> ans = new ArrayList<>();
            
         while(arr.size() > 0){
            int x = arr.size();
            ans.add(x);
             for(int i=0; i<arr.size(); i++){
                 if(min > arr.get(i)){
                     min = arr.get(i);
                 }
             }

            for(int i=0; i<arr.size(); i++){
                arr.set(i, arr.get(i)-min);
                 
            }
            min = 500;
            for(int i=0; i<arr.size(); i++){
                arr.remove(Integer.valueOf(0));
                arr.remove(Integer.valueOf(0));
            }
           System.out.println(arr);
        }
            
        
return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //1 2 3 4 3 3 2 1
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        ArrayList<Integer> ans = cutTheSticks(arr);
        System.out.println(ans);
    }
}