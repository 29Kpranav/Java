import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class mountblue2 {
    public static String gridChallenge(List<String> grid) {
         
      ArrayList<Character> b = new ArrayList<>(); 
      ArrayList<Character> q = new ArrayList<>();  
        for(String c : grid){
            for(char a : c.toCharArray()){   
            b.add(a);
            q.add(a);
            } 
                 
        }
        Collections.sort(b);
        System.out.println(b);
        System.out.println(q);

        for(int j =0; j<b.size(); j++){
            if(b.get(j) != q.get(j)){
                return "NO";
            }     
        }
        return "YES";           
    }
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("eabcd");
        grid.add("olkmn");
        grid.add("trpqs");
        grid.add("xywuv");
        System.out.println(gridChallenge(grid));
    
    }
}


/*public static String gridChallenge(List<String> grid) {
            
            for (int i = 0; i < grid.size(); i++) {
                char[] chararray = grid.get(i).toCharArray();
                Arrays.sort(chararray);
                grid.set(i, new String(chararray));
            }

            for (int i = 0; i < grid.get(0).length(); i++) {
                for (int j = 0; j < grid.size()-1; j++) {
                    if (grid.get(j).charAt(i) > grid.get(j+1).charAt(i)) {
                        return "NO";
                    }
                }
            }
            return "YES";
        } */