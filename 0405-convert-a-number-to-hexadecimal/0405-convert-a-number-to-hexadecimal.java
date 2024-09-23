class Solution {
    public String toHex(int num) {
        char hex_value[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num>=0 && num<=15)
        return Character.toString(hex_value[num]);
        long temp = num;
        if(temp<0)
        temp+=(1L << 32); //calculates 2^32+temp = temp(i.e  equivalent of negative number)
        StringBuilder sb = new StringBuilder();
        while(temp>0){
            sb.insert(0,hex_value[(int)(temp%16)]);
            temp/=16;
        }
        return sb.toString();
    }
}