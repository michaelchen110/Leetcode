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
	public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
		ListNode node = reverseList(head.next); //get the head of new list
		head.next.next = head; //independent action on getting head and change pointer
		head.next = null; // avoid cycle in the 1st head
		return node;
    }
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        head = head.next; 
        prev.next = null;
        while (head.next != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head.next = prev;
        return head;
    }
}
