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
    
    int count;
    public int goodNodes(TreeNode root) {
        
        if(root==null)
            return 0;
        int maxSoFar=root.val;
        //count++;
        depthTraversal(root, maxSoFar);
        return count;
    }

    void depthTraversal(TreeNode node, int maxSoFar){
        if(node==null)
            return;
        maxSoFar=Math.max(node.val, maxSoFar);
        if(node.val>=maxSoFar){
            count++;
        }
        depthTraversal(node.left, maxSoFar);
        depthTraversal(node.right, maxSoFar);
        
    }
}
