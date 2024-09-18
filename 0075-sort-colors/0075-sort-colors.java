class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,0);
        hm.put(1,0);
        hm.put(2,0);
        for(int i:nums){
            hm.put(i,hm.get(i)+1);
        }
        int index=0;
        for(int i=0;i<3;i++){
            int f = hm.get(i);
            for(int j=0;j<f;j++){
                nums[index]=i;
                index++;
            }
        }
    }
}