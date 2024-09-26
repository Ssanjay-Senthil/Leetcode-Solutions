class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans[] = new int[nums.length];
        for(int i:nums){
            if(i%2==0){
                ans[left]=i;
                left++;
            }
            else{
                ans[right]=i;
                right--;
            }
        }
        return ans;
    }
}