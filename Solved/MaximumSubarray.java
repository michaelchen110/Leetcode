import java.util.*;

public class MaximumSubarray {
	public static void main(String[] args) {
		MaximumSubarray tester = new MaximumSubarray();
		tester.unitTest();
    }
    public void unitTest() {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        //System.out.println(maxSubArray(new int[] {-1, -2}));
    }
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + Math.max(0, nums[i-1]); 
            max = Math.max(max, nums[i]); 
        }
        return max;
    }
}
