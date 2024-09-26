class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                s.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])
            j++;
            else
            i++;
        }
        int ans[] = new int[s.size()];
        j=0;
        for(int ki : s){
            ans[j]=ki;
            j++;
        }
        return ans;
    }
}