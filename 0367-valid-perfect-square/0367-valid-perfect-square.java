class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high=num;
        long mid;
        while(low<=high){
            mid=(long)low+(high-low)/2;
            if(mid*mid==num)
            return true;
            else if(mid*mid>num)
            high=(int)mid-1;
            else
            low=(int)mid+1;
        }
        return false;
    }
}