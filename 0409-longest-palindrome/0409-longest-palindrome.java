class Solution {
    public int longestPalindrome(String s) {
        int[] a = new int[58];
        for(char c : s.toCharArray()){
            a[c-'A']++;
        } 
        int ans=0;
        for(int i=0;i<58;i++){
            ans+=a[i]%2==0?a[i]:a[i]-1;
        }
        return ans==s.length()?ans:ans+1;
    }
}