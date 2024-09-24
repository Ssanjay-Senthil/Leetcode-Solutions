class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        if(nums[i]==val)
        k++;
        k=n-k;
        int j=n-1;
        for(int i=0;i<k;i++){
            while(nums[i]==val){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }
        }
        return k;
    }
}