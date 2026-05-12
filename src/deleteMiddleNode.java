public class deleteMiddleNode {
    //https://www.youtube.com/watch?v=ePpV-_pfOeI&ab_channel=takeUforward
    public ListNode deleteMiddle(ListNode head) {
    // Base Condition
        if(head == null || head.next == null) return null;
        // Pointers Created
        ListNode fast = head;
        ListNode slow = head;
        //skip first step to put fast node ahead
        fast = fast.next.next;
        //when fast node is null of fast.next is null it will be past the end of the list or at the last node of the list
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow node will be at the exact middle needed so need to set it to the node after the middle to delete it
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
    }
}
