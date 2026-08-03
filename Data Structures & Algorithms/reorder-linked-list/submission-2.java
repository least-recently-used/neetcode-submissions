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
    public void reorderList(ListNode head) {
    if (head == null || head.next == null) return;
    
    // Phase 1: push back-half nodes onto stack, and remember the middle
    Deque<ListNode> stack = new ArrayDeque<>();
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    // 'slow' is now the last node of the first half
    ListNode secondHalfStart = slow.next;
    slow.next = null;                        // CUT — critical
    
    ListNode walker = secondHalfStart;
    while (walker != null) {
        stack.push(walker);
        walker = walker.next;
    }
    
    // Phase 2: weave. Insert nodes from stack between existing front-half nodes.
    ListNode curr = head;
    while (!stack.isEmpty() && curr != null) {
        ListNode fromEnd = stack.pop();
        ListNode nextInFront = curr.next;
        curr.next = fromEnd;
        fromEnd.next = nextInFront;
        curr = nextInFront;
    }
    // The last inserted node's .next is null because we cut the chain at slow.
}
}
