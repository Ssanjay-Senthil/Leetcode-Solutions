class Solution {
    public String reverseWords(String s) {
        String temp[] = s.trim().split("\s+"); //delimitter to remove more than one space
        String result = "";
        for(int i = temp.length-1;i>=0;i--){
            if(i==0){
                result+=temp[i];
                return result;
            }
            result+=temp[i]+" ";
        }
        return "";
    }
}