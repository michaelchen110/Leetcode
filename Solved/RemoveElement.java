import java.util.*; 

//Example:
//Given nums = [3,2,2,3], val = 3, 
//Your function should return length = 2, with the first two elements of nums being 2.

public class RemoveElement {
	public static void main(String[] args) {
		RemoveElement tester = new RemoveElement();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] nums = {3,2,3,2,2};
        int[] nums = {2,3};
        System.out.println(removeElement(nums, 2));
	}
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                while (right > 0 && nums[right] == val) right--;
                if (left < right) {
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                }
                else break;
            }
            left++;
        }
        return left;
    }
}
