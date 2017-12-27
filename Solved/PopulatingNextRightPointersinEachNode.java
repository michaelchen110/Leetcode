import java.util.*;

public class PopulatingNextRightPointersinEachNode {
	public static void main(String[] args) {
		PopulatingNextRightPointersinEachNode tester = new PopulatingNextRightPointersinEachNode();
		//tester.unitTest();
	}
	//public void unitTest() {

	//}
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeLinkNode prev = queue.poll();
            if (prev.left != null) queue.offer(prev.left);
            if (prev.right != null) queue.offer(prev.right);
            for (int i = 0; i < size - 1; i++) {
                prev.next = queue.poll();
                prev = prev.next;
                if (prev.left != null) queue.offer(prev.left);
                if (prev.right != null) queue.offer(prev.right);
            }
            prev.next = null;
        }
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}
