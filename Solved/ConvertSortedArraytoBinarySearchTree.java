import java.util.*;

public class ConvertSortedArraytoBinarySearchTree {
	public static void main(String[] args) {
		ConvertSortedArraytoBinarySearchTree tester = new ConvertSortedArraytoBinarySearchTree();
		tester.unitTest();
	}
	public void unitTest() {
		int[] a = new int[0];
		TreeNode T = sortedArrayToBST(a);
		T.print();
	}
    public TreeNode sortedArrayToBST(int[] nums) {
		return bst(nums, 0, nums.length-1); 
    }
	private TreeNode bst(int[] nums, int left, int right) {
		if (left > right) return null;
		int mid = (left+right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = bst(nums, left, mid-1);
		root.right = bst(nums, mid+1, right);
		return root;
	}
}
