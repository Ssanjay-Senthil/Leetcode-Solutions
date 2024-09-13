class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target<letters[0] || target>=letters[n-1])
        return letters[0];
        int s=0;
        int e=n-1;
        char ans=' ';
        while(s<=e){
            int mid = s+(e-s)/2;
            if(letters[mid]>target){
                ans = letters[mid];
                e=mid-1;
            }
            else
            s=mid+1;
        }
        return ans;
    }
}