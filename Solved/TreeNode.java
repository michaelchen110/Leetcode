import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
	SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();

	private int order;
	TreeNode() {
		String data = "[1,2,3,null,null,4,5]";
		TreeNode T = serializer.deserialize(data);
		val = T.val;
		left = T.left;
		right = T.right;
	}
	TreeNode(String data) {
		if (data != "[]") {
			TreeNode T = serializer.deserialize(data);
			val = T.val;
			left = T.left;
			right = T.right;
		}
	}
	public void preorder() {
				
	}
	public void inorder() {
		String data = "[4,2,5,1,3]";
		TreeNode T = serializer.deserialize(data);
		val = T.val;
		left = T.left;
		right = T.right;
	}
	public void postorder() {

	}
	public void print() {
        System.out.println(serializer.serialize(this));							
	}

	public void preorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root != null) stack.push(root);
		while (!stack.empty()) {
			TreeNode cur = stack.pop();
			System.out.print(cur.val+" ");
			if (cur.right != null) stack.push(cur.right);
			if (cur.left != null) stack.push(cur.left);
		}
		System.out.println();
	}

	public void levelorder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if (root != null) queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			System.out.print(cur.val+" ");
			if (cur.left != null) queue.offer(cur.left);
			if (cur.right!= null) queue.offer(cur.right);
		}
		System.out.println();
	}

	public void inorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = new TreeNode();
		if (root != null) cur = root;
		while (!stack.empty() || cur != null) {
			while (cur.left != null) {
				stack.push(cur.left);
				cur = cur.left;
			}
			cur = stack.pop();
			System.out.print(cur.val+" ");
			cur = cur.right;
		}
		System.out.println();
	}
}
