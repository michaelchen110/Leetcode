import java.util.*;

public class MajorityElement {
	public static void main(String[] args) {
		MajorityElement tester = new MajorityElement();
		tester.unitTest();
	}
	public void unitTest() {
        int[] nums = new int[]{1,1,2,3,2,2};
        System.out.println(majorityElement(nums));
	}
    public int majorityElement(int[] nums) {
        int mode = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                mode = nums[i];
            }
            else if (mode == nums[i]) count++;
            else count--;
        }
        return mode;
    }
}
