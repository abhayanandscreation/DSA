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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while(temp!= null){
            n++ ;
            temp = temp.next;
        }
        temp = head;
        int size = n/k ;
        int extranumber = n%k ;
        ListNode[] ans = new ListNode[k];
        for(int i = 0; i<k ; i++){
            ans[i] = temp;
            int partsize = size;
            if(extranumber >0){
                partsize++ ;
                extranumber--; 
            }
            for(int j=1; j< partsize; j++){
                if(temp!= null){
                temp = temp.next;
                }
            }
            if(temp!= null){
                ListNode fwd = temp.next;
                temp.next = null;
                temp = fwd;
            }
        } 
        return ans;
    }
}