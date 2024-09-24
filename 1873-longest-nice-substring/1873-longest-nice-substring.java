class Solution {
    public String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        for(char i : s.toCharArray()){
            set.add(i);
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(Character.toLowerCase(s.charAt(i))) && set.contains(Character.toUpperCase(s.charAt(i))))
            continue;
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1,s.length()));
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}