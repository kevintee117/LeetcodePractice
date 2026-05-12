public class mergeLists {
    /*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create head of new linked list to keep track
        ListNode ans = new ListNode();
        //keep ptr as head of the linked list as the ans variable
        // will point to the end of the linked list
        ListNode ptr = ans;
        //loop through 1st and 2nd linked list
        while(list1 != null && list2 != null){
            //if the value in the first list is less than or equal to the value in the
            //2nd list then put the value in the first list next
            if(list1.val <= list2.val){
                ans.next = new ListNode(list1.val);
                //move to next node in the list
                list1 = list1.next;
            }
            //otherwise put the value in the second list next in the linked list
            else{
                ans.next = new ListNode(list2.val);
                //move to next node in the list

                list2 = list2.next;
            }
            //iterate to next node
            ans = ans.next;
        }
        //if the entire first list hasn't been iterated through yet
        //add the rest of the linked list to teh answer
        while(list1 != null){
            ans.next = new ListNode(list1.val);
            list1 = list1.next;
            ans = ans.next;
        }
        //if the entire second list hasn't been iterated through yet
        //add the rest of the linked list to teh answer
        while(list2 != null){
            ans.next = new ListNode(list2.val);
            list2 = list2.next;
            ans = ans.next;
        }
        return ptr.next;
    }
}
