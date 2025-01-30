class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int temp = target - nums[i];
        //     if(hm.containsKey(temp))
        //     return new int[]{hm.get(temp),i};
        //     hm.put(nums[i],i);
        // }
        // return new int[]{};

        for(int i=0;i<nums.length-1;i++){
            int value = target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == value)
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}