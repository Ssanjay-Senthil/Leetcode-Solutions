class Solution {
    public int addDigits(int num) {
        // if(num <= 9)
        // return num;
        // int rem,sum=0;
        // while(num/10 != 0){
        //     sum=0;
        //     while(num!=0){
        //         rem=num%10;
        //         sum+=rem;
        //         num/=10;
        //     }
        //     if(sum<10)
        //     break;
        //     else
        //     num=sum;
        //     }
        // return sum;
        // O(1) approach
        if(num==0)
        return 0;
        if(num%9 == 0)
        return 9;
        else
        return num%9;
    } 
}