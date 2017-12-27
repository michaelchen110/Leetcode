import java.util.*;

public class ClosestBinarySearchTreeValue {
	public static void main(String[] args) {
		ClosestBinarySearchTreeValue tester = new ClosestBinarySearchTreeValue();
		tester.unitTest();
	}
	public void unitTest() {
        //TreeNode root = new TreeNode("[10,5,15,1,6,12,20]");
        //TreeNode root = new TreeNode("[2,1]");
        TreeNode root = new TreeNode("[0]");
        root.print();
        System.out.println(closestValue(root, 7483648));
	}
    public int closestValue(TreeNode root, double target) {
        TreeNode child = target < root.val ? root.left : root.right;
        if (child == null) return root.val;
        int close = closestValue(child, target);
        return Math.abs(target - close) < Math.abs(target - root.val) ? close : root.val;
    }
}
