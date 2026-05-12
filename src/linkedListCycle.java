import java.util.ArrayList;
import java.util.HashSet;

public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        //if the head is null or the next one is null, return false
        if(head == null || head.next == null) {
            return false;
        }
        //create a hashset to keep track of already visited nodes
        HashSet<ListNode> alreadyVisited = new HashSet<>();
        ListNode current = head;
        //loop through the hashset
        while(current.next != null) {
            //if we visit an already visited node, it is a cycle so return true
            if(alreadyVisited.contains(current)) {
                return true;
            }
            //add already visited node
            alreadyVisited.add(current);
            //loop to next one
            current = current.next;
        }
        //if there wasn't any found cycles through the above algorithm, return false
        return false;
    }
}