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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Inorder(root,l);
        return l;
    }
    public static void Inorder(TreeNode root,List<Integer> l){
        TreeNode temp = root;
        if(temp == null)
        return;
        Inorder(temp.left,l);
        l.add(temp.val);
        Inorder(temp.right,l);
    }
}