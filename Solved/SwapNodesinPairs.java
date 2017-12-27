import java.util.*;

public class SwapNodesinPairs {
	public static void main(String[] args) {
		SwapNodesinPairs tester = new SwapNodesinPairs();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode head = new ListNode(new int[] {1,2});
        head.print();
        head = swapPairs(head);
        head.print();
	}
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = swapPairs(head.next.next);
        head.next.next = head;
        head = head.next;
        head.next.next = next;
        return head;
    }
}
