class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.length;
        int index;
        for(int i=0;i<n;i++){
            index = Math.abs(nums[i])-1;
            if(nums[index]>0)
            nums[index] = -nums[index];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        return l;
    }
}