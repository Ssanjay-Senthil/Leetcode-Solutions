class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int mid;
        if(x<2)
        return x;
        while(s<=e){
            mid = s+(e-s)/2;
            if((long)mid*(long)mid<(long)x)
            s=mid+1;
            else if((long)mid*(long)mid==(long)x)
            return mid;
            else
            e=mid-1;
        }
        return e;
    }
}