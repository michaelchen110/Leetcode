import java.util.*;

public class RemoveDuplicatesfromSortedArra {
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedArra tester = new RemoveDuplicatesfromSortedArra();
		tester.unitTest();
	}
	public void unitTest() {
        int[] nums = {1,1,1,2,3,5};
        //int[] nums = {};
        System.out.println(removeDuplicates(nums));
	}
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[idx++] = nums[i];
            while (i+1 < nums.length && nums[i+1] == nums[i]) i++;
        }
        return idx;
    }
}
