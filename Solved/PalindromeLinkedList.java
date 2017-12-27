import java.util.*;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		PalindromeLinkedList tester = new PalindromeLinkedList();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode n = new ListNode(new int[]{1});
        System.out.println(isPalindrome(n));
	}
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            len++;
        }
        if (len <= 1) return true;

        ListNode left = head;
        ListNode right;
        for (int i = 0; i < len / 2 - 1; i++) left = left.next;
        if (len % 2 == 0) right = left.next;
        else right = left.next.next;
        left = reverse(head, left);
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head, ListNode tail) {
        if (head == tail) return tail;
        ListNode newHead = reverse(head.next, tail);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
