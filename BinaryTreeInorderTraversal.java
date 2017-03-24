import java.util.*;

public class BinaryTreeInorderTraversal {
	public static void main(String[] args) {
		BinaryTreeInorderTraversal tester = new BinaryTreeInorderTraversal();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode();
		System.out.println(Arrays.toString(inorderTraversal(T).toArray()));
	}
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		inOrder(res, root);
		return res;
    }
	private void inOrder(List<Integer> res, TreeNode node) {
		if (node == null) return;
		if (node.left != null) inOrder(res, node.left);
		res.add(node.val);
		if (node.right != null) inOrder(res, node.right);
	}
}
