import java.util.*;

public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber tester = new MissingNumber();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = {0,1,3,4,5,2,7};
        int[] nums = {0};
        System.out.println(missingNumber(nums));
	}
    public int missingNumber(int[] nums) {
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            check = check^i^nums[i];
        }
        return check^nums.length;
    }
}
