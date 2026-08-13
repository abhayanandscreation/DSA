public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int countA = 0;
        int countB = 0;

        ListNode slow = headA;
        ListNode fast = headB;
        while (slow != null) {
            countA++;
            slow = slow.next;
        }
        while (fast != null) {
            countB++;
            fast = fast.next;
        }
        slow = headA;
        fast = headB;
        if (countA > countB) {
            int diff = countA - countB;
            for (int i = 0; i < diff; i++) {
                slow = slow.next;
            }
        } 
        else {
            int diff = countB - countA;

            for (int i = 0; i < diff; i++) {
                fast = fast.next;
            }
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}