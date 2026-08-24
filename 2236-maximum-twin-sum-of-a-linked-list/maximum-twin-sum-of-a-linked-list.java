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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode c = reverse(slow.next);
        ListNode i = head;
        ListNode j = c;
        int maxSum = 0;
        int sum =0;
        while(j!= null){ 
            sum = i.val + j.val;
            if(sum >= maxSum){
                maxSum= sum;
                i= i.next;
                j= j.next;
            }
            else{
                i= i.next;
                j= j.next;
            }
        }
        return maxSum;

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