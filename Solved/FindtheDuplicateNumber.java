import java.util.*;

public class FindtheDuplicateNumber {
	public static void main(String[] args) {
		FindtheDuplicateNumber tester = new FindtheDuplicateNumber();
		tester.unitTest();
	}
	public void unitTest() {
        int[] a = {1,3,4,2,2};
        System.out.println(findDuplicate(a));
	}
    public int findDuplicateOn2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) return nums[i];
        }
        return -1;
    }
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
