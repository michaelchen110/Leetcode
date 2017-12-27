import java.util.*;

public class ValidateBinarySearchTree {
	public static void main(String[] args) {
		ValidateBinarySearchTree tester = new ValidateBinarySearchTree();
		tester.unitTest();
	}
	public void unitTest() {
        //TreeNode root = new TreeNode("[15,4,20,3,10]");
        TreeNode root = new TreeNode("[10,5,15,null,null,6,20]");
        System.out.println(isValidBST(root));
	}
    public boolean isValidBST(TreeNode root) {
        return inorder(root, new Stack<>());
    }
    private boolean inorder(TreeNode root, Stack<Integer> stack) {
        if (root == null) return true;
        if (!inorder(root.left, stack)) return false;
        if (!stack.empty() && root.val <= stack.pop()) return false;
        stack.push(root.val);
        return inorder(root.right, stack);
    }
}
