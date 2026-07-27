/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode prev=head;
        ListNode curr=head;

        while(curr!=null){
            prev=prev.next;
            curr=curr.next;
            if(curr!=null) {curr=curr.next;} else {break;}
            if(prev==curr){
                return true;
            }
        }

        return false;
    
    }
}
