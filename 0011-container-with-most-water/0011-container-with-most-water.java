class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max=0;
        int area;
        while(s<e){
            int min = Math.min(height[s],height[e]);
            area=(e-s)*min;
            if(area>max)
            max=area;
            if(height[s]<height[e])
            s++;
            else
            e--;
        }
        return max;
    }
}