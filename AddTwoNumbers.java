public class AddTwoNumbers{
	public static void main(String[] args) {
		int[] a = {5,1};
		int[] b = {9};
		test(a,b);
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int a, b, carry = 0;
		ListNode sentinel = new ListNode(-1);
		ListNode head = sentinel;
		while (l1 != null || l2 != null) {
			a = l1 == null ? 0 : l1.val;	
			b = l2 == null ? 0 : l2.val;	
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
			head.next = new ListNode((a+b+carry)%10);
			carry = (a+b+carry)/10;
			head = head.next;
		}
		if (carry > 0) {
			head.next = new ListNode(carry);
		}
		return sentinel.next;
	}
	public static void test(int[] a, int[] b) {
		ListNode n1 = new ListNode(-1);
		ListNode n2 = new ListNode(-1);
		ListNode head1 = n1;
		ListNode head2 = n2;
		for (int n: a) {
			n1.next = new ListNode(n);
			n1 = n1.next;
		}
		for (int n: b) {
			n2.next = new ListNode(n);
			n2 = n2.next;
		}
		n1 = head1.next;
		n2 = head2.next;
		while (n1!=null) {
			System.out.print(n1.val + " -> ");
			n1 = n1.next;
		}
		System.out.println();
		while (n2!=null) {
			System.out.print(n2.val + " -> ");
			n2 = n2.next;
		}
		System.out.println();
		ListNode result = addTwoNumbers(head1.next, head2.next);
		while (result!=null) {
			System.out.print(result.val + " -> ");
			result = result.next;
		}
		System.out.println();
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
