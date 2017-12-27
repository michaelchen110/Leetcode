import java.util.*;

public class LowestCommonAncestorofaBinaryTree {
	public static void main(String[] args) {
		LowestCommonAncestorofaBinaryTree tester = new LowestCommonAncestorofaBinaryTree();
		tester.unitTest();
	}
	public void unitTest() {
        TreeNode root = new TreeNode("[3,5,1,6,2,0,8,null,null,7,4]");
        TreeNode lca = lowestCommonAncestor(root, root.left.left, root.left.right.left);
        System.out.println(lca.val);
	}
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        List<List<TreeNode>> res = new LinkedList<>();
        TreeNode lca = null;
        dfs(res, new LinkedList<>(), root, p);
        dfs(res, new LinkedList<>(), root, q);
        int len = Math.min(res.get(0).size(), res.get(1).size());
        for (int i = 0; i < len; i++) {
            if (res.get(0).get(i) != res.get(1).get(i)) break;
            lca = res.get(0).get(i);
        }
        return lca;
    }
    private boolean dfs(List<List<TreeNode>> res, List<TreeNode> tmp, TreeNode root, TreeNode target) {
        if (root == null) return false;
        boolean find = false;
        tmp.add(root);
        if (root == target) {
            res.add(new LinkedList<>(tmp));
            find = true;
        }
        else {
            find = dfs(res, tmp, root.left, target) || 
                   dfs(res, tmp, root.right, target);
        }
        tmp.remove(tmp.size() - 1);
        return find;
    }
}
