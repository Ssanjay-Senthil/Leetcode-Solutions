class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int m = 2*n;
        int ans[] = new int[m];
        for(int i=0;i<m;i++){
            if(i%2==0)
            ans[i] = nums[j++];
            else
            ans[i] = nums[n++];
        }
        return ans;
    }
}