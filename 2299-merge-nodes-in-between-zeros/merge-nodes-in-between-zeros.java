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
    public ListNode mergeNodes(ListNode head) {

        ListNode mergenode = head.next;
        ListNode temp = head.next;

        while(temp != null)
        {
            int sum = 0;

            while(temp.val != 0)
            {
                sum = temp.val + sum;
                temp = temp.next;
            }

            mergenode.val = sum;

            temp = temp.next;

            mergenode.next = temp;

            mergenode = mergenode.next;
        }
        return head.next;
    }
}