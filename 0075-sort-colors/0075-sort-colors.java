class Solution {
    public void sortColors(int[] nums) {
        // Using HashMap
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // hm.put(0,0);
        // hm.put(1,0);
        // hm.put(2,0);
        // for(int i:nums){
        //     hm.put(i,hm.get(i)+1);
        // }
        // int index=0;
        // for(int i=0;i<3;i++){
        //     int f = hm.get(i);
        //     for(int j=0;j<f;j++){
        //         nums[index]=i;
        //         index++;
        //     }
        // }
        // Using 3 pointers
        int r=0,w=0;
        int b=nums.length-1;
        while(w<=b){
            if(nums[w]==0){
                int temp = nums[r];
                nums[r]=nums[w];
                nums[w]=temp;
                w++;
                r++;
            }
            else if(nums[w]==1){
                w++;
            }
            else{
                int temp = nums[w];
                nums[w]=nums[b];
                nums[b]=temp;
                b--;
            }
        }
    }
}