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
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<>();
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        while(temp!= null){
            arr.add(temp);
            temp= temp.next;
        }
        int n = arr.size()-1;
        for(int i=n; i>= 1; i--){
            arr.get(i).next = arr.get(i-1);
        }
        arr.get(0).next = null;
        return arr.get(n);
    }
}