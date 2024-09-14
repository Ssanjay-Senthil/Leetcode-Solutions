class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }    
        }
        nums[index] = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2){
                max2 = nums[i];
            }    
        }
        return (max-1)*(max2-1);
    }
}