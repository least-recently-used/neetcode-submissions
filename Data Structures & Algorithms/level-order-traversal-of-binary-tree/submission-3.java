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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list =new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> subList=null;
        if(root!=null )
            queue.offer(root);
       
     

        while(!queue.isEmpty()){
            int len=queue.size();
            subList=new ArrayList<>();
            for(int i=0; i< len; i++){
                TreeNode curr=queue.poll();
                if(curr.left!= null) queue.offer(curr.left);
                if(curr.right!= null) queue.offer(curr.right);
                subList.add(curr.val);
            }
            list.add(subList);
        }
        return list;

    }
}
