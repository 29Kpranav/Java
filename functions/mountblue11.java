import java.util.*;

public class mountblue11 {
    public static void cavityMap(List<String> grid) {
        
        int n = grid.size();
        char a[][] = new char[n][n];
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid.size(); j++){
                a[i][j] = grid.get(i).charAt(j);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
       // int x=0, y=0;
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid.size(); j++){
                 if(i != 0 && j != 0 && i != grid.size()-1 && j != grid.size()-1){
                     if(a[i][j] > a[i-1][j] && a[i][j] > a[i+1][j] && a[i][j] > a[i][j-1] && a[i][j] > a[i][j+1]){
                          a[i][j] = 'x';
                     }
                 }
            }
        }

        System.out.println();
        for(int i=0; i<grid.size(); i++){
           for(int j=0; j<grid.size(); j++){
              System.out.print(a[i][j]+" ");
            }
              System.out.println();
        }
        //System.out.println(grid.size());
        //return grid;
        List<String> ans = new ArrayList<>();
        String s = "";
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid.size(); j++){
                 s = ""+a[i][j];
                 System.out.print(s);
                 if(s.length() == grid.size()){
                    ans.add(s);
                 } 
             }
         }
        // System.out.println(s);
         System.out.println();
        System.out.println(ans);
         
    }
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("1112");
        grid.add("1912");
        grid.add("1892");
        grid.add("1234");
        cavityMap(grid);
    }
}
