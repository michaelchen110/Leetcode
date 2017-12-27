import java.util.*;

public class LinkedListCycle {
	public static void main(String[] args) {
		LinkedListCycle tester = new LinkedListCycle();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (fast != null) {
            head = head.next;
            fast = fast.next;
            if (fast == null) return false;
            fast = fast.next;
            if (head == fast) return true;
        }
        return false;
    }
}
