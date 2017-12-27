import java.util.*;

public class SearchforaRange {
	public static void main(String[] args) {
		SearchforaRange tester = new SearchforaRange();
		tester.unitTest();
	}
	public void unitTest() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 4)));
	}
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};
        int start = 0, end = nums.length - 1, left = -1, right = -1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) end = mid;
            else if (nums[mid] < target) start = mid;
            else end = mid;
        }
        if (nums[end] == target) left = end;
        if (nums[start] == target) left = start;
        
        start = 0;
        end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) start = mid;
            else if (nums[mid] < target) start = mid;
            else end = mid;
        }
        if (nums[start] == target) right = start;
        if (nums[end] == target) right = end;
        return new int[] {left, right};
    }
}
