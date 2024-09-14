class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int temp=x;
        int ans=0;
        while(temp!=0){
            int rem = temp%10;
            ans=ans*10+rem;
            temp/=10;
        }
        return x == ans;
    }
}