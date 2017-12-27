import java.util.*;

public class PathSumII {
	public static void main(String[] args) {
		PathSumII tester = new PathSumII();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode("[5,4,8,11,null,13,4,7,2,null,null,5,1]");
		for (List<Integer> l : pathSum(T, 22)) 
			System.out.println(Arrays.toString(l.toArray()));
	}
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new LinkedList<>();
		dfs(res, new LinkedList<>(), root, sum);
		return res;
    }
	private void dfs(List<List<Integer>> result, List<Integer> path, TreeNode root, int target) {
		if (root == null) return;
		path.add(root.val);
		if (root.val == target && root.left == null && root.right == null) result.add(new LinkedList<>(path));
		else {
			dfs(result, path, root.left, target-root.val);
			dfs(result, path, root.right, target-root.val);
		}
		path.remove(path.size()-1);
	}
}
