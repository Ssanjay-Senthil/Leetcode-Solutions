class Solution {
    public String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str,new Comparator<String>()
        {
            @Override
            public int compare(String a,String b){
                String a1 = a+b;
                String b1 = b+a;
                return b1.compareTo(a1);
            }
        });
        if(str[0].equals("0"))
        return "0";
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length;i++){
            ans.append(str[i]);
        }
        return ans.toString();
    }
}