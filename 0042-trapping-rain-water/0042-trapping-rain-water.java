class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        int l=0;
        int r=n-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int ans = 0;
        while(l<r){
            if(leftMax<=rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                ans += leftMax-height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                ans += rightMax-height[r];
            }
        }
        return ans;
        // int l[] = new int[n];
        // int r[] = new int[n];
        // int leftMax = 0;
        // int rightMax = 0;
        // int i,j;
        // for(i=0,j=n-1;i<n && j>=0;i++,j--){
        //     leftMax = Math.max(leftMax,height[i]);
        //     l[i]=leftMax;
        //     rightMax = Math.max(rightMax,height[j]);
        //     r[j]=rightMax;
        // }
        // int ans=0;
        // for(i=0;i<n;i++){
        //     ans+=Math.min(l[i],r[i])-height[i];
        // }
        // return ans;
    }
}