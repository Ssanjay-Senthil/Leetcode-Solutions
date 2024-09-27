class Solution {
    public int countBinarySubstrings(String s) {
        int count=1;
        List<Integer> l =new ArrayList<>();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))
            count++;
            else{
                l.add(count);
                count=1;
            }
        }
        l.add(count);
        int result=0;
        for(int i=1;i<l.size();i++){
            result+=Math.min(l.get(i-1),l.get(i));
        }
        return result;
    }
}