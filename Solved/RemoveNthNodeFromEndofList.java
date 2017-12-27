import java.util.*;

//Given linked list: 1->2->3->4->5, and n = 2.
//After removing the second node from the end, the linked list becomes 1->2->3->5.

public class RemoveNthNodeFromEndofList {
	public static void main(String[] args) {
		RemoveNthNodeFromEndofList tester = new RemoveNthNodeFromEndofList();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode list = new ListNode(new int[]{1,2,3,4,5});
        ListNode l = removeNthFromEnd(list, 1);
        l.print();
	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        while (head != null) {
            len++;
            head = head.next;
        }
        head = sentinel;

        while (len-- > n) {
            head = head.next;
        }
        head.next = head.next.next;
        return sentinel.next;
    }
}
