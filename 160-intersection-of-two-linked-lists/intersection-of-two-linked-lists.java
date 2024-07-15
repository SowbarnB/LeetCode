/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;

        int N1 = 0;
        while(t1 != null)
        {
            N1++;
            t1 = t1.next;
        }

        int N2 = 0;
        while(t2 != null)
        {
            N2++;
            t2 = t2.next;
        }
        
        if(N1 < N2)
        {
            return collisionpoint(headA, headB, N2 - N1);
        }
        else
        {
            return collisionpoint(headB, headA, N1 - N2);
        }
    }
    public ListNode collisionpoint(ListNode t1, ListNode t2, int d)
    {
        while(d > 0)
        {
            d--;
            t2 = t2.next;
        }

        while(t1 != t2)
        {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}
//timecomplexity: O(n + 2m)