class Solution {
    public String intToRoman(int num) {
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int n[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0;
        String s = new String();
        while(num>0){
            if(num>=n[i]){
                s+=roman[i];
                num-=n[i];
            }
            else
            i++;
        }
        return s;
    }
}