import java.util.*;


public class BalancedBinaryTree {
	public static void main(String[] args) {
		BalancedBinaryTree tester = new BalancedBinaryTree();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode(1);
		T.left = new TreeNode(2);
		T.right = new TreeNode(2);
		T.right.right = new TreeNode(2);
		/* T.left.left = new TreeNode(2); */
		/* T.left.left.left = new TreeNode(2); */
		TreeNode P = new TreeNode();
		System.out.println(isBalanced(T));
	}
    public boolean isBalanced(TreeNode root) {
		return dfs(root)!= -1;	
    }
	private int dfs(TreeNode node) {
		if (node == null) return 0;
		else {
			int left = dfs(node.left);
			if (left == -1) return -1;
			int right = dfs(node.right);
			if (right == -1 || Math.abs(left-right) > 1) return -1;
			return Math.max(left, right) + 1;
		}
	}
}
