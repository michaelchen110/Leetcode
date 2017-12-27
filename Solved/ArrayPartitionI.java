import java.util.*;

public class ArrayPartitionI {
	public static void main(String[] args) {
		ArrayPartitionI tester = new ArrayPartitionI();
		tester.unitTest();
	}
	public void unitTest() {
        int[] nums = {1,4,7,8,10,12};
        System.out.println(arrayPairSum(nums));
	}
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) count += nums[i];
        return count;
    }
}
