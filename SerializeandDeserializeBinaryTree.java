import java.util.*;

public class SerializeandDeserializeBinaryTree {
	public static void main(String[] args) {
		SerializeandDeserializeBinaryTree tester = new SerializeandDeserializeBinaryTree();
		tester.unitTest();
	}
	public void unitTest() {
		/* String data = "[1,2,3,null,null,4,5,123,null,123,11111111,null,999]"; */
		String data = "[]";
		TreeNode node = deserialize(data);
		/* System.out.println(serialize(deserialize(data))); */
	}

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
		if (root == null) return "[]";
		Queue<TreeNode> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder("[");

		queue.offer(root);
		sb.append(root.val);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left == null) sb.append(",null");
				else {
					sb.append("," + node.left.val);
					queue.offer(node.left);
				}
				if (node.right == null) sb.append(",null");
				else {
					sb.append("," + node.right.val);
					queue.offer(node.right);
				}
			}
		}
		sb.append("]");
		while (sb.indexOf(",null]") != -1)
			sb.delete(sb.length()-6, sb.length()-1);
		return sb.toString();    
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
		if (data.equals("[]")) return null;
		int idx = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		String[] node = data.substring(1, data.length()-1).split(",");

		TreeNode root = new TreeNode(Integer.parseInt(node[idx++]));
		queue.offer(root);
		while (idx < node.length) {
			int branch = queue.size();
			for (int i = 0; i < branch && idx < node.length; i++) {
				TreeNode cur = queue.poll();
				if (!node[idx].equals("null")) {
					cur.left = new TreeNode(Integer.parseInt(node[idx]));
					queue.offer(cur.left);
				}
				idx++;
				if (idx < node.length && !node[idx].equals("null")) {
					cur.right = new TreeNode(Integer.parseInt(node[idx]));
					queue.offer(cur.right);
				}
				idx++;
			}
		}
		return root;
	}
}
