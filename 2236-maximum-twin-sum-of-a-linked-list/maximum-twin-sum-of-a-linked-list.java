class Solution {
    public int pairSum(ListNode head) {
      /*  ListNode slow = head;
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
        return maxSum; */
        ListNode slow = head ;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        ListNode b = Reverse(slow.next);
        slow.next = b;
        ListNode temp = head;
        int maxsum = 0;
        while(b != null){
            int sum = temp.val + b.val;
            maxsum = Math.max(maxsum, sum);
            temp = temp.next;
            b = b.next;
        }
        return maxsum;

    }
    ListNode Reverse(ListNode head){
        if(head==null || head.next== null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = Reverse(a);
        a.next = head;
        return b;
    }
    /* ListNode reverse(ListNode head){
            if(head== null || head.next == null) return head;
            ListNode a = head.next;
            head.next = null;
            ListNode b = reverse(a);
            a.next = head;
            return b;
        } */
}