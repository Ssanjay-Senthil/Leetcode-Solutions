class Solution {
    public int longestPalindrome(String s) {
        int[] a = new int[52];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>=65 && c<=90)
            a[c-'A']++;
            else
            a[c-'a'+26]++;
        } 
        int ans=0;
        int flag=0;
        int flag1=0;
        System.out.print(Arrays.toString(a));
        for(int i=0;i<52;i++){
            if(a[i]%2==0)
            ans+=a[i];
            else if(a[i]%2==1){
                if(flag==0 && flag1==0 && a[i]==1){
                    ans+=1;
                    flag=1;
                    flag1=1;
                }
                else if(a[i]>2){
                    if(flag1==1)
                    ans+=a[i]-1;
                    else{
                        ans+=a[i];
                        flag1=1;
                    }
                }
            }
        }
        return ans;
    }
}