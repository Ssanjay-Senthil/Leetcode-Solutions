class Pair
{
    int row,col,level;
    Pair(int row,int col,int level){
        this.row = row;
        this.col = col;
        this.level = level;
    }
}    
class Solution {
    public int orangesRotting(int[][] grid) {
        int ans;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int max_level = 0;
        int[][] visited = new int[n][m];
        int fresh_oranges = 0; //to check if all oranges are rotten finally
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 2){
                    visited[i][j] = 1;
                    queue.add(new Pair(i,j,0));
                }
                if(grid[i][j] == 1)
                fresh_oranges++;
            }
        }
        int drow[] = {0,1,0,-1}; //right,down,left,up
        int dcol[] = {1,0,-1,0}; //right,down,left,up
        while(!queue.isEmpty())
        {
            int r = queue.peek().row;
            int c = queue.peek().col;
            int curr_level = queue.peek().level;
            queue.poll();
            max_level = Math.max(max_level,curr_level);
            for(int i=0;i<4;i++) //4-directions
            {
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    queue.add(new Pair(nrow,ncol,curr_level+1));
                    visited[nrow][ncol] = 1;
                    fresh_oranges--;
                }
            }
        }
        if(fresh_oranges == 0)
            return max_level;
        return -1;
    }
}