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
    static int ans;
    static int count;
    public int kthSmallest(TreeNode root, int k) {
        count = 1;
        ans = -1;
        display(root,k);
        return ans;
    }
    public static void display(TreeNode root,int k){
        if(root == null)
        return;
        display(root.left,k);
        if(count++ == k)
        {
            ans = root.val;
            return;
        }
        display(root.right,k);
    }
}