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
    public TreeNode invertTree(TreeNode root) {
        //return null when root is null
        if(root==null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);

        //took a dummy node to swap left and right
        TreeNode dummy;
        dummy=root.left;
        root.left=root.right;
        root.right=dummy;

        return root;
    }
}
