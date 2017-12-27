import java.util.*;

public class DeleteNodeinaBST {
	public static void main(String[] args) {
		DeleteNodeinaBST tester = new DeleteNodeinaBST();
		tester.unitTest();
	}
	public void unitTest() {
		String data = "[5,3,6,2,4,null,7]";
		/* String data = "[]"; */
		TreeNode T = new TreeNode(data);
		TreeNode p = deleteNode(T, 4);
		p.print();
	}
    public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) return null;
		if (key < root.val) root.left = deleteNode(root.left, key);
		else if (key > root.val) root.right = deleteNode(root.right, key);
		else {
			if (root.left == null) root = root.right;
			else if (root.right == null) root = root.left;
			else {
				TreeNode rightMin = root.right;
				while (rightMin.left != null) rightMin = rightMin.left;
				root.val = rightMin.val;
				root.right = deleteNode(root.right, root.val);
			}
		}
		return root;
	}
}
