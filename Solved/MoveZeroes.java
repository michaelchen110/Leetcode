import java.util.*;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

public class MoveZeroes {
	public static void main(String[] args) {
		MoveZeroes tester = new MoveZeroes();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0,1,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
	}
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[slow++] = nums[i];
        }
        while (slow < nums.length) nums[slow++] = 0;
    }
}
