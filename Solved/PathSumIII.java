import java.util.*;

public class PathSumIII {
	public static void main(String[] args) {
		PathSumIII tester = new PathSumIII();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode("[10,5,-3,3,2,null,11,3,-2,null,1]");
		System.out.println(pathSum(T, 8));
	}
    public int pathSum(TreeNode root, int sum) {
		if (root == null) return 0;
		return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	private int dfs(TreeNode root, int sum) {
		if (root == null) return 0;
		int count = 0;
		if (root.val == sum) count++;
		return count + dfs(root.left, sum-root.val) + dfs(root.right, sum-root.val);
	}
}
