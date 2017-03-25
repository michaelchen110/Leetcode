import java.util.*;

public class SameTree {
	public static void main(String[] args) {
		SameTree tester = new SameTree();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode("[1,2,3,4]");
		TreeNode W = new TreeNode("[1,2,3,4]");

		System.out.println(isSameTree(T,W));
	}
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
		else if (p == null || q == null) return false;
		else if (p.val != q.val) return false;
		return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
    }
}
