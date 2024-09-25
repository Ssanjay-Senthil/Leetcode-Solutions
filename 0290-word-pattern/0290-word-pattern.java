class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split("\s+");
        if(pattern.length() != a.length)
        return false;
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(!hm.containsValue(a[i]))
                hm.put(pattern.charAt(i),a[i]);
                else
                return false;
            }
            else{
                if(a[i].compareTo(hm.get(pattern.charAt(i))) != 0) return false;
            }
        }
        return true;
    }
}