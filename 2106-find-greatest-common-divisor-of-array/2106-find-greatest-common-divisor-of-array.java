class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max)
            max=i;
            if(i<min)
            min=i;
        }
        return gcd(min,max);
    }
    public static int gcd(int a1,int a2){
        while(a1!=a2){
            if(a1>a2)
            a1-=a2;
            else
            a2-=a1;
        }
        return a1;
    }
}