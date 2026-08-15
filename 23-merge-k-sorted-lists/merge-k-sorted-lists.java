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
    ListNode head;
    ListNode tail;
    void AddAtTail(int val){
        ListNode temp= new ListNode(val);
        if(head==null){
            head=tail=temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i < lists.length; i++){
            ListNode temp = lists[i];
              while (temp != null){
            arr.add(temp.val);
            temp=temp.next;
              }
        }
        Collections.sort(arr);
        head= null;
        tail= null;
        for(int i=0; i< arr.size(); i++){
            AddAtTail(arr.get(i));
        }
        return head;

    }
}