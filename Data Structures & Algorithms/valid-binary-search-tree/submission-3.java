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
    public boolean isValidBST(TreeNode root) {
        int lower = Integer.MIN_VALUE;
        int upper = Integer.MAX_VALUE;
        return traverseTree(lower, root, upper);
    }

    boolean traverseTree(int lower, TreeNode root, int upper) {
        if (root == null)
            return true;
        if (!(lower < root.val && root.val < upper)) {
            return false;
        }

        return traverseTree(lower, root.left, root.val)
            && traverseTree(root.val, root.right, upper);
    }
}
