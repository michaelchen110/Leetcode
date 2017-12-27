import java.util.*;

//Given the sorted linked list: [-10,-3,0,5,9],

//One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

//      0
//     / \
//   -3   9
//   /   /
// -10  5

public class ConvertSortedListtoBinarySearchTree {
	public static void main(String[] args) {
		ConvertSortedListtoBinarySearchTree tester = new ConvertSortedListtoBinarySearchTree();
		tester.unitTest();
	}
	public void unitTest() {
        ListNode node = new ListNode(new int[]{-10, -3, 0, 5, 9});
        TreeNode head = sortedListToBST(node);
        head.print();
	}
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
        return buildTree(l, 0, l.size() - 1);
    }
    private TreeNode buildTree(List<Integer> array, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(array.get(mid));
        node.left = buildTree(array, left, mid - 1);
        node.right = buildTree(array, mid + 1, right);
        return node;
    }
}
