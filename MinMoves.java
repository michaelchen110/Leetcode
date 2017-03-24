import java.util.*;

public class MinMoves{
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(minMoves(a));
	}
	public static int minMoves(int[] nums) {
		int moves = 0;
		int min = findKthLargest(nums, nums.length);
		for (int i : nums) {
			moves = moves + i-min;
		}
		return moves;
    }
	public static int qs(int[] nums, int k, int left, int right){
		if (left >= right) return left;
		int l = left - 1, r = right, p = (l+r+1)/2;
		swap(nums, p, r);
		do {
			do {l++;} while (nums[l] < nums[right]);
			do {r--;} while (nums[r] > nums[right] && r > left);
			if (l<r) swap(nums, l, r);
			System.out.println(l + " " + r);
			System.out.println(Arrays.toString(nums));
		} while (l<r);
		swap(nums, l, right);
		if (k-1 <= r) return qs(nums, k, left, r);
		else if (k-1 <= l) return nums[l];
		else return qs(nums, k-l , l+1, right);
	}
	public static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
    public static int findKthLargest(int[] nums, int k) {
        int start = 0, end = nums.length - 1, index = nums.length - k;
        while (start < end) {
            int pivot = partion(nums, start, end);
            if (pivot < index) start = pivot + 1; 
            else if (pivot > index) end = pivot - 1;
            else return nums[pivot];
        }
        return nums[start];
    }
    
    public static int partion(int[] nums, int start, int end) {
        int pivot = start, temp;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;
            if (start > end) break;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        temp = nums[end];
        nums[end] = nums[pivot];
        nums[pivot] = temp;
        return end;
    }


}
