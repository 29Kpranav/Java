 //Qs - Rotten Oranges
 // appproch 2

  /* 
 public int orangesRotting(int[][] grid) {
    if (grid == null||grid.length == 0){
        return 0;
    }
    Queue<int []> q = new LinkedList<>();
    int n = grid.length;
    int m = grid[0].length;

    int fresh = 0, time = 0;

    for(int i = 0; i < n; i++){
       for(int j = 0; j < m; j++){
            if(grid[i][j] == 2){
               q.offer(new int[]{i, j});
            }
            if(grid[i][j] != 0){
               fresh++;
            }
       }
    }
    if(fresh == 0){
       return 0;
    }
    int count = 0;

    while(!q.isEmpty()){
        int size = q.size();
        count += size;
        while(size != 0){
            int point[] = q.poll();

            int ax[] = {1, -1, 0, 0};
            int ay[] = {0, 0, 1, -1};

            for(int i = 0; i < 4; i++){
                int x = point[0] + ax[i];    
                int y = point[1] + ay[i];

                if(x<0 || y<0 || x>=n || y>=m || grid[x][y]==0 || grid[x][y]==2){
                    continue;
                }
                grid[x][y]=2;
                q.offer(new int[]{x,y});
            } 
            size--;
        }
        if(q.size() != 0){
            time++;
        }
        
    }

    return fresh == count ? time : -1;
}
 */