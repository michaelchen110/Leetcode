import java.util.*;

public class Subset {
	public static void main(String[] args) {
		Subset tester = new Subset();
		tester.unitTest();
	}
	public void unitTest() {
		int[] nums = {1,2,3,3,4,2,2,5};
		List<List<Integer>> sub = new LinkedList<>();
		List<Integer> path = new LinkedList<>();
		boolean[] used = new boolean[nums.length];
		Arrays.fill(used, false);
		Arrays.sort(nums);
		/* combination(sub, path, nums, 0, 6); */
		permutation(sub, path, used, nums, 0);
		for (List<Integer> l : sub)
			System.out.println(Arrays.toString(l.toArray()));
	}
	public void combination(List<List<Integer>> res, List<Integer> path, int[] nums, int start, int target){
		if (target == 0) res.add(new LinkedList<>(path));
		else {
			for (int i = start; i < nums.length; i++) {
				if (i > start && nums[i-1] == nums[i]) continue;
				path.add(nums[i]);
				combination(res, path, nums, i+1, target - nums[i]);
				path.remove(path.size()-1);
			}
		}
	}
	public void permutation(List<List<Integer>> res, List<Integer> path, boolean[] used, int[] nums, int start) {
		if (start == nums.length) res.add(new LinkedList<>(path));
		else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || i > 0 && !used[i-1] && nums[i-1] == nums[i]) continue;
				used[i] = true;
				path.add(nums[i]);
				permutation(res, path, used, nums, i+1);
				path.remove(path.size()-1);
				used[i] = false;
			}
		} 
	}
}
