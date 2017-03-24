import java.util.*;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ReverseLinkedList tester = new ReverseLinkedList();
		tester.unitTest();
	}
	public void unitTest() {
		ListNode n = new ListNode();
		reverseList(n).print();
	}
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
		ListNode node = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return node;
    }
}
