import java.util.*;

public class PathSum {
	public static void main(String[] args) {
		PathSum tester = new PathSum();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode("[5,4,8,11,null,14,4,7,2,null,null,null,1]");
		System.out.println(hasPathSum(T, 22));
	}
    public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) return false;
		if (root.val == sum && root.left == null && root.right == null) return true;
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
