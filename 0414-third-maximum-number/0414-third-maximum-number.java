class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer smax = null;
        Integer tmax = null;
        for(Integer n : nums){
            if(n.equals(max) || n.equals(smax) || n.equals(tmax)) continue;
            if(max==null || n>max){
                tmax = smax;
                smax = max;
                max = n;
            }
            else if(smax==null || smax<n){
                tmax = smax;
                smax = n;
            }
            else if(tmax==null || tmax<n){
                tmax = n;
            }
        }
        return tmax==null?max:tmax;
    }
}