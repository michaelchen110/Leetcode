import java.util.*;

public class RotateList {
	public static void main(String[] args) {
		RotateList tester = new RotateList();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode head = new ListNode(new int[] {1,2,3,4,5});
        head.print();
        ListNode rotate = rotateRight(head, 3);
        rotate.print();
	}
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int len = 1;
        ListNode cur = head, newHead;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        cur.next = head;

        for (int l = len - k%len; l > 0; l--) cur = cur.next;
        newHead = cur.next;
        cur.next = null;
        return newHead;
    }
}
