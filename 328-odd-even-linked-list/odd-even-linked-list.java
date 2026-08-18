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
    public ListNode oddEvenList(ListNode head) {
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-2);
        ListNode temp = head;
        int count = 0;
        ListNode even = head1;
        ListNode odd = head2;
        while(temp != null){
            if(count % 2 == 0){
                even.next= temp;
                even = temp;
            }
            else{
                odd.next = temp;
                odd = temp;
            }
            temp = temp.next;
            count++ ;
        }
        odd.next= null;
        even.next= head2.next;
        return head1.next;
    }
}