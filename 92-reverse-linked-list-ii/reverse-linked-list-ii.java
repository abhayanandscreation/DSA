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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a = new ListNode(-1);
        a.next = head;
        ListNode temp = a;
        ListNode b = a;
        ListNode c = a;
        ListNode d = head;
        for(int i =1; i<= right ; i++){
            c = c.next;
            if(i == left-1){
                temp = c;
            }
            if(i == left){
                b = c;
            }
        }
        d = c.next;
        temp.next = null;
        c.next = null;
        reverse(b);
        temp.next = c;
        b.next = d;
        return a.next;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }
}