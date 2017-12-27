import java.util.*;

public class FourSum {
	public static void main(String[] args) {
		FourSum tester = new FourSum();
		tester.unitTest();
	}
	public void unitTest() {
		/* int[] S = {1, 0, -1, 0, -2, 2}; */
		int[] S = {-3,-2,-1,0,0,1,2,3};
		int t = 0;
		/* System.out.println(Arrays.toString(S)); */
		List<List<Integer>> res = fourSum(S,t);
		for (List<Integer> r : res)
			System.out.println(Arrays.toString(r.toArray()));
	}
    public List<List<Integer>> fourSum(int[] nums, int target) {
		int len = nums.length;
		List<List<Integer>> result = new LinkedList<>();
		Arrays.sort(nums);
		for (int i = 0; i < len - 3; i++) {
			for (int j = i+1; j < len - 2; j++) {
				int left = j+1;
				int right = len-1;
				while (left < right) {
					if (nums[i]+nums[j]+nums[left]+nums[right] == target) {
						List<Integer> res = new LinkedList<>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[left]);
						res.add(nums[right]);
						result.add(res);
						/* critical point */
						while (++left < right && nums[left] == nums[left-1]) continue;
						while (left < --right && nums[right] == nums[right+1]) continue;
					}
					else if (nums[i]+nums[j]+nums[left]+nums[right] < target) {
						left++;
					}
					else {
						right--;
					}
				}
				/* critical point */
				while (j+1 < len-2 && nums[j+1] == nums[j]) j++;
			}
			/* critical point */
			while (i+1 < len-3 && nums[i+1] == nums[i]) i++;
		}
		return result;
    }
}
