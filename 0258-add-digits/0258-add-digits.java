class Solution {
    public int addDigits(int num) {
        if(num == 0)
        return 0;
        int sum,rem;
        while(num/10 != 0){
            sum=0;
            while(num!=0){
                rem=num%10;
                sum+=rem;
                num/=10;
            }
            if(sum/10==0)
            return sum;
            else
            num=sum;
            }
        return num;
    } 
}