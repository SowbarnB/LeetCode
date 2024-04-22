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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head; int count = 0;

        while(temp != null)
        {
            count = count + 1;
            temp = temp.next;
        }
        int midnode = ( count / 2 ) + 1;
        temp = head; 
        while(temp != null)
        {
            midnode--;
            if(midnode == 0)
            {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}