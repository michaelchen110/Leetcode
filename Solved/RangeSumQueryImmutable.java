import java.util.*;

//Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

//Example:

//Given nums = [-2, 0, 3, -5, 2, -1]

//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3

//You may assume that the array does not change.
//There are many calls to sumRange function.

public class RangeSumQueryImmutable {
	public static void main(String[] args) {
        int[] nums = {-2,0,3,-5,2,-1};
		RangeSumQueryImmutable tester = new RangeSumQueryImmutable(nums);
		tester.unitTest();
	}
	public void unitTest() {
        System.out.println(sumRange(0,2));
        System.out.println(sumRange(2,5));
        System.out.println(sumRange(0,5));
	}

    int[] cdf;
    public RangeSumQueryImmutable(int[] nums) {
        cdf = new int[nums.length + 1];
        cdf[0] = 0; 
        for (int i = 0; i < nums.length; i++) {
            cdf[i + 1] = cdf[i] + nums[i];
        }
    }
    public int sumRange(int i, int j) {
        return cdf[j + 1] - cdf[i];
    }
}
