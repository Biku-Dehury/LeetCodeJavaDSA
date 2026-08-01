class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //gopi
        // 1. Initialize a dummy node to build the new list
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // 2. Loop until both lists are empty AND there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from nodes, or 0 if the list has ended
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // 3. Calculate sum and carry
            int sum = carry + x + y;
            carry = sum / 10;
            
            // 4. Create new node with the single digit (sum % 10)
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // 5. Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual head (ignoring our dummy 0)
        return dummyHead.next;
    }
}