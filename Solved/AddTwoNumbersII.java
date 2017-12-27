import java.util.*;
public class AddTwoNumbersII {
	public static void main(String[] args) {
		AddTwoNumbersII tester = new AddTwoNumbersII();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode l1 = new ListNode(new int[] {});
        ListNode l2 = new ListNode(new int[] {5,6,4});
        ListNode l = addTwoNumbers(l1, l2);
        l.print();
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s = new Stack<>();
        ListNode cur = new ListNode(0);
        ListNode head = cur;
        int carry = 0;
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        while (!s1.empty() || !s2.empty()) {
            int n1 = s1.empty() ? 0 : s1.pop();
            int n2 = s2.empty() ? 0 : s2.pop();
            s.push((carry + n1 + n2) % 10);
            carry = (carry + n1 + n2) / 10;
        }
        if (carry > 0) s.push(carry);
        while (!s.empty()) {
            cur.next = new ListNode(s.pop());
            cur = cur.next;
        }
        return head.next;
    }
}
