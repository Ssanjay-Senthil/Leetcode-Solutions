class Solution {
    public int findCircleNum(int[][] isConnected) {
        int visited[] = new int[isConnected.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = isConnected.length; 
        //Converting adjacency matrix to adjacency list
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && isConnected[i][j] == 1)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(adj,visited,i);
                count++;
            }
        }
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int visited[],int node){
        visited[node]=1;
        for(int i:adj.get(node))
        {
            if(visited[i]==0)
            dfs(adj,visited,i);
        }
    }
}