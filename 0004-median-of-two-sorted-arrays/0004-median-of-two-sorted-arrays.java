class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = merge(nums1,nums2);
        double ans=0;
        int nm = nums3.length;
        ans=nm%2==1?(double)nums3[nm/2]:(double)(nums3[nm/2]+nums3[nm/2-1])/2;
        return ans;
    }
    public static int[] merge(int nums1[],int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        int nm = n+m;
        int nums3[] = new int[nm];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j])
            nums3[k++]=nums1[i++];
            else
            nums3[k++]=nums2[j++];
        }
        while(i<n){
            nums3[k++]=nums1[i++];
        }
        while(j<m)
        nums3[k++]=nums2[j++];
        return nums3;
    }
}