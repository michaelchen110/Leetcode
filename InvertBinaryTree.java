import java.util.*;

public class InvertBinaryTree {
	public static void main(String[] args) {
		InvertBinaryTree tester = new InvertBinaryTree();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode();
		T.print();
		invertTree(T).print();
	}
    public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
    }
}
