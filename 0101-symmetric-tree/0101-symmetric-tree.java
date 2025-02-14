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
    public boolean isSymmetric(TreeNode root) {
        return pre(root.left,root.right);
    }
    public static boolean pre(TreeNode lef,TreeNode righ){
        if(lef == null && righ == null)
        return true;
        else if(lef == null || righ == null)
        return false;
        return lef.val == righ.val && pre(lef.left,righ.right) && pre(lef.right,righ.left);
    }
}