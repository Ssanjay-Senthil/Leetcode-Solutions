class Pair
{
    int row;
    int col;
    Pair(int r,int c)
    {
        row=r;
        col=c;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count_landcell = 0;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(grid[i][j] == 1)
                count_landcell++;
            }
        }
        int visited[][] = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0;i<m;i++){ //for first and last row boundaries
            if(grid[0][i]==1){
                visited[0][i] = 1;
                queue.add(new Pair(0,i));
            }
            if(grid[n-1][i]==1){
                visited[n-1][i] = 1;
                queue.add(new Pair(n-1,i));
            }
        }
        for(int i=1;i<n-1;i++){ //for first and last column excluding first and last row elements
            if(grid[i][0]==1){
                visited[i][0]=1;
                queue.add(new Pair(i,0));
            }
            if(grid[i][m-1]==1){
                visited[i][m-1]=1;
                queue.add(new Pair(i,m-1));
            }
        }
        int drow[] = {0,1,0,-1};
        int dcol[] = {1,0,-1,0};
        while(!queue.isEmpty())
        {
            int r = queue.peek().row;
            int c = queue.peek().col;
            queue.poll();
            for(int i=0;i<4;i++){
                int nrow = drow[i]+r;
                int ncol = dcol[i]+c;
                if(nrow>0 && nrow<n-1 && ncol>0 && ncol<m-1 && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    count_landcell--;
                    visited[nrow][ncol]=1;
                    queue.add(new Pair(nrow,ncol));
                }
            }
        }
        return count_landcell;
    }
}