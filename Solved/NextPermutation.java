import java.util.*;

//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

//If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

//The replacement must be in-place, do not allocate extra memory.

//Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1

public class NextPermutation {
	public static void main(String[] args) {
		NextPermutation tester = new NextPermutation();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = {5,9,8,7,1};
        int[] nums = {1};
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
	}
    public void nextPermutation(int[] nums) {
        int idx = 0;
        for (int i = nums.length - 2; i >= idx; i--) {
            if (nums[i] < nums[i + 1]) idx = i;
        }
        //swap
        for (int i = nums.length -1; i > idx; i--) {
            if (nums[idx] < nums[i]) {
                swap(nums, idx, i);
                idx++;
                break;
            }
        }
        //reverse
        for (int i = nums.length - 1; i > idx; i--) swap(nums, idx++, i);
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
