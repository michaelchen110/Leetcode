import java.util.*;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	ListNode() {
		ListNode cur = new ListNode(-1);
		cur.next = this;
		for (int x : new int[]{1,2,3,4,5,6}) {
			cur.next.val = x;
			cur = cur.next;
			cur.next = new ListNode(-1);
		}
		cur.next = null;
	}
	ListNode(int[] a) {
		ListNode cur = new ListNode(-1);
		cur.next = this;
		for (int x : a) {
			cur.next.val = x;
			cur = cur.next;
			cur.next = new ListNode(-1);
		}
		cur.next = null;
	}
	public void deleteNode(ListNode node) {
		ListNode cur = new ListNode(-1);
		cur.next = this;
		while (cur.next != null) {
			if (cur.next == node) cur.next = cur.next.next;
		}
	}
	public void print() {
		ListNode cur = next;
		System.out.print(val);
		while (cur != null) {
			System.out.print(", "+cur.val);
			cur = cur.next;
		}
		System.out.println();
	}
}
