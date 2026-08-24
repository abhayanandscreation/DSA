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
        if(head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode c = reverse(slow.next);
        slow.next = null;

        ListNode i = head;
        ListNode j = i.next;
        ListNode k = c;

        while(k != null){
            ListNode l = k.next;

            i.next = k;
            k.next = j;

            i = j;

            if(j != null)
                j = j.next;

            k = l;
        }
    }

    ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode a = head.next;
        head.next = null;

        ListNode b = reverse(a);

        a.next = head;

        return b;
    }
}