/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int ans = height(root);
        return ans;
    }
    public static int height(TreeNode temp){
        if(temp == null)
        return 0;
        int leftHeight = height(temp.left);
        int rightHeight = height(temp.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}