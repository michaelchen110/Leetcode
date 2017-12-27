import java.util.*;

//Input:
//    Tree 1                     Tree 2
//          1                         2
//         / \                       / \
//        3   2                     1   3
//       /                           \   \
//      5                             4   7
//Output:
//Merged tree:
//         3
//        / \
//       4   5
//      / \   \
//     5   4   7

public class MergeTwoBinaryTrees {
	public static void main(String[] args) {
		MergeTwoBinaryTrees tester = new MergeTwoBinaryTrees();
		tester.unitTest();
	}
	public void unitTest() {
        TreeNode t1 = new TreeNode("[1,3,2,5]");
        TreeNode t2 = new TreeNode("[2,1,3,null,4,null,7]");
        TreeNode t = mergeTrees(t1, t2);
        t.print();
	}
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode node = (t1 == null && t2 == null) ? null : new TreeNode(val);
        if (node != null) {
            node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
            node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        }
        return node;
    }
}
