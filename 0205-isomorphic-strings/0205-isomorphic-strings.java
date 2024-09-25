class Solution {
    public boolean isIsomorphic(String s, String t) {
        int a[] = new int[256];
        int b[] = new int[256];
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)] != b[t.charAt(i)])
            return false;
            a[s.charAt(i)] = i+1; //if we make a[s.charAt(i)]++ , then it checks only frequency of letters same or which may result in logical error.
            b[t.charAt(i)] = i+1;
        }
        return true;
    }
}