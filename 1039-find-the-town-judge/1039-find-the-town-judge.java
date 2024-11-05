class Solution {
    public int findJudge(int n, int[][] trust) {
        int inDegree[] = new int[n+1];
        int outDegree[] = new int[n+1];
        for(int[] i : trust)
        {
            int out = i[0];
            int in = i[1];
            inDegree[in]++;
            outDegree[out]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(inDegree[i]==n-1 && outDegree[i]==0)
            return i;
        }
        return -1;
    }
}