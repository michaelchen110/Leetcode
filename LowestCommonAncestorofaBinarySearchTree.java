import java.util.*;

public class LowestCommonAncestorofaBinarySearchTree {
	public static void main(String[] args) {
		LowestCommonAncestorofaBinarySearchTree tester = new LowestCommonAncestorofaBinarySearchTree();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode("[2,1]");
		TreeNode L = lowestCommonAncestor(T, T.left, T);
		System.out.println(L.val);
	}
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) return null;
		List<List<TreeNode>> res = new LinkedList<>(); 
		TreeNode LCA = null;
		dfs(res, new LinkedList<>(), root, p);
		dfs(res, new LinkedList<>(), root, q);
		for (int i = 0; i < Math.min(res.get(0).size(), res.get(1).size()); i++) {
			if (res.get(0).get(i) != res.get(1).get(i)) break;
			LCA = res.get(0).get(i);
		}
		return LCA;
    }
	public void dfs(List<List<TreeNode>> result, List<TreeNode> path, TreeNode root, TreeNode target) {
		if (root == null) return;
		path.add(root);
		if (root == target) result.add(new LinkedList<>(path));
		else {
			dfs(result, path, root.left, target);
			dfs(result, path, root.right, target);
		}
		path.remove(path.size()-1);
	}
}
