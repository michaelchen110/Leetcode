import java.util.*;

public class SymmetricTree {
	public static void main(String[] args) {
		SymmetricTree tester = new SymmetricTree();
		tester.unitTest();
	}
	public void unitTest() {
        //TreeNode root = new TreeNode("[1,2,2,3,4,4]");
        TreeNode root = new TreeNode("[]");
        root.print();
        System.out.println(isSymmetric(root));
	}
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return symmetry(root.left, root.right);
    }
    private boolean symmetry(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return symmetry(left.left, right.right) && symmetry(left.right, right.left);
    }
}
