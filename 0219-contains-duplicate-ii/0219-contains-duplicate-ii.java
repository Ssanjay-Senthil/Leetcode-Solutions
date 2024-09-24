class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> sw = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i>k)
            sw.remove(nums[i-k-1]);
            if(!sw.add(nums[i]))
            return true;
        }
        return false;
    }
}