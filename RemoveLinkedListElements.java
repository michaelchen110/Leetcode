import java.util.*;

public class RemoveLinkedListElements {
	public static void main(String[] args) {
		RemoveLinkedListElements tester = new RemoveLinkedListElements();
		tester.unitTest();
	}
	public void unitTest() {
		int[] list = {1,2,5,2,4,3};
		ListNode l = new ListNode(list);
		removeElements(l, 2);
		l.print();
	}
    public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		if (head.val == val) return removeElements(head.next, val);
		head.next = removeElements(head.next, val);
		return head;
    }
}
