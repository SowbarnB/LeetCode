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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead = reverseList(slow.next);
        ListNode first = head;
        ListNode second = newhead;

        while(second != null)
        {
            if(first.val != second.val)
            {
                reverseList(newhead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode newhead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        
        return newhead;
    }
}
//timecomplexity: O(2*N)