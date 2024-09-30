class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i:nums){
            int index = Math.abs(i);
            if(nums[index]<0)
            return index;
            nums[index] = -nums[index];
        }
        return 0;
    }
}