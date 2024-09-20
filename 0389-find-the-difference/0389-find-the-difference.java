class Solution {
    public char findTheDifference(String s, String t) {
        String a = s+t;
        char ans = 0;
        for(char i : a.toCharArray()){
            System.out.print(ans+" ");
            ans = (char)(ans^i);
        }
        return ans;
    }
}