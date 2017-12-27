import java.util.*;

public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
		SearchinRotatedSortedArray tester = new SearchinRotatedSortedArray();
		tester.unitTest();
	}
	public void unitTest() {
         int[] nums = {4,5,6,7,8,9,1,2,3}; 
         //int[] nums = {4,5,6,7,8,9}; 
		//int[] nums = {5,1,3};
		System.out.println(search(nums, 1));
	}

	public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1,
            start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > nums[left]) {
                if (nums[left] <= target && target < nums[mid]) end = mid;
                else start = mid;
            }
            else {
                if (nums[mid] < target && target <= nums[end]) start = mid;
                else end = mid;
            }
        }
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }

	public int search2(int[] nums, int target) {
		if (nums.length == 0) return -1;
		int left = 1;
		int right = nums.length - 1;
		int pivot = nums.length;
		while (left <= right) {
			int mid = (left+right)/2;
			if (nums[mid-1] > nums[mid]) {
				pivot = mid;
				break;
			}
			if (nums[mid] < nums[0]) right = mid-1;
			else left = mid+1;
		}
		left = 0;
		right = nums.length - 1;
		if (target >= nums[0]) right = (pivot-1)%nums.length;
		else if (target < nums[0]) left = pivot%nums.length;
		while (left <= right) {
			int mid = (left+right)/2;
			if (nums[mid] < target)  left = mid+1;
			else if (nums[mid] > target) right = mid-1;
			else return mid;
		}
		return -1;
	}

}
