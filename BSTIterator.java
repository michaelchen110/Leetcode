import java.util.*;

public class BSTIterator {
	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		BSTIterator tester = new BSTIterator(t);
		tester.unitTest();
	}
	public void unitTest() {
		BSTIterator iter = new BSTIterator(new TreeNode());
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	Stack<TreeNode> stack;
	TreeNode cur;
    public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		if (root != null) cur = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
		return (!stack.empty() || cur!=null);
    }

    /** @return the next smallest number */
    public int next() {
		int res;
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}
		cur = stack.pop();
		res = cur.val;
		cur = cur.right;
		return res;
    }
}
