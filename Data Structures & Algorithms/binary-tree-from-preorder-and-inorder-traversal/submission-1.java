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
    int preOrderIndex=0;
    Map<Integer, Integer> inOrderMap= new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // make inorder map
        
        int i=0;
        for(int el : inorder){
            inOrderMap.put(el, i);
            i++;
        }

        return build(preorder, 0, inorder.length-1);
    }

    TreeNode build(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }
        int rootVal=preorder[preOrderIndex++];
        TreeNode root= new TreeNode(rootVal);
        int mid=inOrderMap.get(rootVal);

        root.left=build(preorder, left, mid-1);
        root.right=build(preorder,mid+1, right);

        return root;
        
    }









}
