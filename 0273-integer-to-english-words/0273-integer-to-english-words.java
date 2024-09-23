class Solution {
    String oneToTwenty[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        String s = "";
        if(num == 0){
            return "Zero";
        }
        else
        s = help(num);
        return s;
    }
    public String help(int n){
        StringBuilder sb = new StringBuilder();
        if(n<=20)
        sb.append(oneToTwenty[n]);
        else if(n<100)
        sb.append(tens[n/10]).append(" ").append(oneToTwenty[n%10]);
        else if(n<1000)
        sb.append(help(n/100)).append(" Hundred ").append(help(n%100));
        else if(n<1000000)
        sb.append(help(n/1000)).append(" Thousand ").append(help(n%1000));
        else if(n<1000000000)
        sb.append(help(n/1000000)).append(" Million ").append(help(n%1000000));
        else
        sb.append(help(n/1000000000)).append(" Billion ").append(help(n%1000000000));
        return sb.toString().trim();
    }
}