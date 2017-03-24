import java.util.*;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		MergeTwoSortedLists tester = new MergeTwoSortedLists();
		tester.unitTest();
	}
	public void unitTest() {
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(1);
		ListNode m = mergeTwoLists(a, b);
		m.print();
	}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode sentinel = new ListNode(-1);
		ListNode head = sentinel;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				head.next = new ListNode(l1.val);	
				l1 = l1.next;
			}
			else {
				head.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			head = head.next;
		}
		while (l1 != null) {
			head.next = new ListNode(l1.val);
			head = head.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			head.next = new ListNode(l2.val);
			head = head.next;
			l2 = l2.next;
		}
		return sentinel.next;
    }
}
