import java.util.*;

public class KthSmallestElementinaBST {
	public static void main(String[] args) {
		KthSmallestElementinaBST tester = new KthSmallestElementinaBST();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode S = new TreeNode();
		S.inorder();
		S.print();

		System.out.println(kthSmallest(S, 3));
	}
    public int kthSmallest(TreeNode root, int k) {
		/* List<Integer> path = new LinkedList<>(); */
		/* inorder(path, root, k); */
		/* return path.get(path.size()-1); */
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = new TreeNode();
		if (root != null) cur = root;
		while (!stack.empty() || cur != null) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			if (k-- == 1) return cur.val;
			cur = cur.right;
		}
		return -1;
    }
	private void inorder(List<Integer> path, TreeNode node, int k) {
		if (node == null) return;
		inorder(path, node.left, k);
		if (path.size() == k) return;
		else path.add(node.val);
		inorder(path, node.right, k);
	}
}
