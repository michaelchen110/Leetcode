import java.util.*;

public class LinkedListCycleII {
	public static void main(String[] args) {
		LinkedListCycleII tester = new LinkedListCycleII();
		tester.unitTest();
	}
	public void unitTest() {
                 
	}
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;
        while (head != fast) {
            head = head.next;
            fast = fast.next;
        }
        return head;
    }
}
