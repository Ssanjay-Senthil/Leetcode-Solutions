class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int ans=0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i:s){
            if(hm.get(i)==i)
            ans=i;
        }
        if(ans==0)
        return -1;
        return ans;
    }
}