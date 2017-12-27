import java.util.*;

public class BinaryTreePaths {
	public static void main(String[] args) {
		BinaryTreePaths tester = new BinaryTreePaths();
		tester.unitTest();
	}
	public void unitTest() {
		TreeNode T = new TreeNode(1);
		T.left = new TreeNode(2);
		T.right = new TreeNode(3);
		T.right.right = new TreeNode(13);
		T.left.left = new TreeNode(5);
		T.left.left.left = new TreeNode(9);
		T.left.left.left.left = new TreeNode(19);
		List<String> res = binaryTreePaths(T);
		System.out.println(Arrays.toString(res.toArray(new String[res.size()])));
	}
    public List<String> binaryTreePaths(TreeNode root) {
		StringBuilder sb = new StringBuilder();  
		List<String> result = new ArrayList<>();
		preOrder(result, sb, root);
		return result;
    }
	private void preOrder(List<String> result, StringBuilder path, TreeNode node) {
		if (node == null) return;
		path.append("->" + node.val);
		if (node.left == null && node.right == null) result.add(path.substring(2).toString());
		else {
			preOrder(result, path, node.left);
			preOrder(result, path, node.right);
		}
		path.delete(path.length() - 2 - Integer.toString(node.val).length(), path.length());
	}
}
