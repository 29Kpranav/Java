 
 //200. Number of Islands

 

 /*An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 You may assume all four edges of the grid are all surrounded by water.
 
 Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1 */

class Solution {
    boolean isValid(int i, int j, int n, int m, char[][] grid){
       if(i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == '1'){
           return true;
       }
       return false;
   }
   void numsIslandsRec(int i, int j, int n, int m, char[][] grid){
       grid[i][j] = '0';  // put 0 to not visit grid[i][j] = 1 again..

       if(isValid(i+1, j, n, m, grid))
           numsIslandsRec(i+1, j, n, m, grid);
           
       if(isValid(i-1, j, n, m, grid))
           numsIslandsRec(i-1, j, n, m, grid);

       if(isValid(i, j+1, n, m, grid))
           numsIslandsRec(i, j+1, n, m, grid);
       
       if(isValid(i, j-1, n, m, grid))
           numsIslandsRec(i, j-1, n, m, grid);
   }
   public int numIslands(char[][] grid) {
       int n = grid.length;
       int m = grid[0].length;

       int count = 0;
       for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    count++;
                    numsIslandsRec(i, j, n, m, grid);
                }
           }
       }
       return count;
   }
}