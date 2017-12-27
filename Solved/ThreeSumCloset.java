import java.util.*;
import java.lang.Math.*;

public class ThreeSumCloset{
	public static void main(String[] args) {
		int[] t = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(t, -1));
	}
	public static int threeSumClosest(int[] nums, int target) {
		int closest = target > 0 ? Integer.MAX_VALUE : Integer.MAX_VALUE+target;
		int start, end;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			start = i+1;
			end = nums.length - 1;
			while (start < end) {
				if (Math.abs(nums[i]+nums[start]+nums[end]-target) < Math.abs(closest-target)) 
					closest = nums[i]+nums[start]+nums[end];
				if (nums[i]+nums[start]+nums[end] == target) 
					return target;
				else if (nums[i]+nums[start]+nums[end] < target) 
					start++;
				else 
					end--;
			}
		}
		return closest;
	}
}
