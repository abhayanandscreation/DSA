class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1newhead = reverse(l1);
        ListNode l2newhead = reverse(l2);

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode temp1 = l1newhead;
        ListNode temp2 = l2newhead;

        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int sum = carry;

            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);

            current.next = newNode;
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode a = head.next;
        head.next = null;

        ListNode b = reverse(a);

        a.next = head;

        return b;
    }
}