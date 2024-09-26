class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int ans[] = new int[nums.length];
        for(int i:nums){
            if(i%2==0){
                ans[even]=i;
                even+=2;
            }
            else{
                ans[odd]=i;
                odd+=2;
            }
        }
        return ans;
    }
}