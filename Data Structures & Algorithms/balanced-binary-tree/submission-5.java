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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
       
        int h1=0;
        int h2=0;
        
        h1=height(root.left);
        
        h2=height(root.right);
        if (Math.abs(h1 - h2) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftH=height(node.left);
        int leftR=height(node.right);

        return 1+Math.max(leftH, leftR);
    }


}
