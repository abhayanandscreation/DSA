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
        while(fast.next!= null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode c = reverse(slow.next);
        ListNode i = head;
        ListNode j = c;
        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j= j.next;
        }
        return true;
    }
        ListNode reverse(ListNode head){
            if(head== null || head.next == null) return head;
            ListNode a = head.next;
            head.next = null;
            ListNode b = reverse(a);
            a.next = head;
            return b;
        }
}