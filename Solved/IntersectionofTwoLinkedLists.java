import java.util.*;

public class IntersectionofTwoLinkedLists {
	public static void main(String[] args) {
		IntersectionofTwoLinkedLists tester = new IntersectionofTwoLinkedLists();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode cur = headA;
        while (cur != null) {
            lenA++;
            cur = cur.next;
        }
        cur = headB;
        while (cur != null) {
            lenB++;
            cur = cur.next;
        }

        ListNode longer = lenA > lenB ? headA : headB;
        ListNode shorter = lenA <= lenB ? headA : headB;
        for (int i = 0; i < Math.abs(lenA - lenB); i++) {
            longer = longer.next;
        }
        while (longer != null && longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }
}
