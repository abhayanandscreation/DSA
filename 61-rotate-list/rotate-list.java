class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head;
        int size = 0;
        ListNode count = head;
        while (count != null) {
            size++;
            count = count.next;
        }
        k = k % size;
        if (k == 0) {
            return head;
        }
        for (int l = 0; l < k; l++) {
            j = j.next;
        }
        while (j.next != null) {
            i = i.next;
            j = j.next;
        }
        ListNode temp = i.next;
        i.next = null;
        j.next = head;
        return temp;
    }
}