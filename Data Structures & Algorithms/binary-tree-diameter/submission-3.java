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
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);
        return max;
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }

        // calculate left / right
        int diameterLeft=height(root.left);
        int diameterRight=height(root.right);

        // at each point check which is max
        max=Math.max(max, diameterLeft+diameterRight);
        
        return 1+Math.max(diameterLeft, diameterRight);
      
    }

}
