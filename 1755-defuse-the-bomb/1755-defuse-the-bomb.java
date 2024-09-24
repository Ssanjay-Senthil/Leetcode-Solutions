class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        if(k==0){
            return ans;
        }
        int left = 1;
        int right = k;
        int sum=0;
        if(k<0){
            k=-k;
            left = n-k;
            right = n-1;
        }
        for(int i=left;i<=right;i++) sum+=code[i];
        for(int i=0;i<n;i++){
            ans[i] = sum;
            sum-=code[(left++)%n];
            sum+=code[(++right)%n];
        }
        return ans;
    }
}