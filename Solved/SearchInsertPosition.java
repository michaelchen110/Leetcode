import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition tester = new SearchInsertPosition();
        tester.unitTest();
    }
    public void unitTest() {
        int[] nums = {1,3,5,6};
        int out = searchInsert(nums, 0);
        System.out.println(out);
    }
    //[1,3,5,6], 5 → 2
    //[1,3,5,6], 2 → 1
    //[1,3,5,6], 7 → 4
    //[1,3,5,6], 0 → 0
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int mid;

        while (left <= right) {
            mid = (left + right)/2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}
