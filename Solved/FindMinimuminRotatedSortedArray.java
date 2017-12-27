import java.util.*;

public class FindMinimuminRotatedSortedArray {
	public static void main(String[] args) {
		FindMinimuminRotatedSortedArray tester = new FindMinimuminRotatedSortedArray();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = {4,5,6,7,1,2};
        int[] nums = {4,5,6,7};
        System.out.println(findMin(nums));
	}
    public int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (nums[start] < nums[mid]) start = mid;
            else end = mid;
        }
        int result = Math.min(nums[start], nums[end]);
        result = Math.min(Math.min(nums[0], nums[nums.length - 1]), result);
        return result;
    }
}
