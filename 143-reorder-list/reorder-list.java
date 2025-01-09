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
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode right = slow.next;
        slow.next = null;
        ListNode prev = null;


        while(right != null)
        {
            ListNode temp = right.next;
            right.next = prev;
            prev = right;
            right = temp;
        }

        ListNode left = head;
        right = prev;

        while(right != null)
        {
            ListNode temp1 = left.next, temp2 = right.next;
            left.next = right;
            right.next = temp1;
            left = temp1;
            right = temp2;
        }
    }
}