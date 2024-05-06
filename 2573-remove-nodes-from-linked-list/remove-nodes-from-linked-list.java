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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;

        Stack<ListNode> st = new Stack<>();
        
        while(temp != null)
        {
            while(!st.isEmpty() && st.peek().val < temp.val)
            {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }

        ListNode next = null;

        while(!st.isEmpty())
        {
            temp = st.pop();
            temp.next = next;
            next = temp;
        }
        return temp;
    }
}
//timecomplexity: O(n)