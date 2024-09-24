class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int left = 0;
        int right = r*c-1;
        int mid;
        while(left<=right){
            mid = left + (right-left)/2;
            int i = mid/c;
            int j = mid%c;
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]>target)
            right=mid-1;
            else
            left=mid+1;
        }
        return false;
    }
}