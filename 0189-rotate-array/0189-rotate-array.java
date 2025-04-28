class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int dup[] = nums.clone();
        for(int i=0;i<n;i++){
            nums[(k+i)%n] = dup[i];
        }
    }
}