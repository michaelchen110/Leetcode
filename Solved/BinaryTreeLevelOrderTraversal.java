import java.util.*;

public class BinaryTreeLevelOrderTraversal {
	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversal tester = new BinaryTreeLevelOrderTraversal();
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
		List<List<Integer>> res = levelOrder(T);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(Arrays.toString(res.get(i).toArray(new Integer[res.get(i).size()])));
		}
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> res = new LinkedList<>();
		if(root != null) queue.offer(root);
		while(!queue.isEmpty()) {
			int num = queue.size();
			res.add(res.size(), new LinkedList<Integer>());
			for (int i = 0; i < num; i++) {
				TreeNode node = queue.poll();
				res.get(res.size()-1).add(i, node.val); 
				if (node.left != null) queue.offer(node.left);	
				if (node.right != null) queue.offer(node.right);	
			}
		}
		return res;
	}
}
