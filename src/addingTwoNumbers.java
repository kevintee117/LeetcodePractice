public class addingTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carryNum = 0;
        while(l1 != null || l2 != null || carryNum != 0) {
            int value1 = 0;
            int value2 = 0;
            if(l1 != null) {
                value1 = l1.val;
            }
            if(l2 != null) {
                value2 = l2.val;
            }
            int addBothNumbers =  value1 + value2 + carryNum;
            carryNum = addBothNumbers / 10;
            curr.next = new ListNode(addBothNumbers%10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }



    public static void main(String[] args) {
        
    }
}


