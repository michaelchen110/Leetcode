import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		RotateArray tester = new RotateArray();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = { 1,2,3,4,5,6,7 };
        int[] nums = {};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
	}
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
