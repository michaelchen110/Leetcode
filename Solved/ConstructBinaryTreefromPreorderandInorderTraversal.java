import java.util.*;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public static void main(String[] args) {
		ConstructBinaryTreefromPreorderandInorderTraversal tester = new ConstructBinaryTreefromPreorderandInorderTraversal();
		tester.unitTest();
	}
	public void unitTest() {
        int[] pre = {5,2,1,4,3,6,7};
        int[] in = {1,2,3,4,5,6,7};
        TreeNode t = buildTree(pre, in);
        t.print();
	}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int idx = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                idx = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, idx + 1), Arrays.copyOfRange(inorder, 0, idx));
        root.right = buildTree(Arrays.copyOfRange(preorder, idx + 1, preorder.length), Arrays.copyOfRange(inorder, idx + 1, inorder.length));
        return root;
    }
}
