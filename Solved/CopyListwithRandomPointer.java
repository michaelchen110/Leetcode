import java.util.*;

public class CopyListwithRandomPointer {
	public static void main(String[] args) {
		CopyListwithRandomPointer tester = new CopyListwithRandomPointer();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode cur = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();        
        while (cur != null) {
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
}
