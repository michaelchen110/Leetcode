import java.util.*;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		ContainerWithMostWater tester = new ContainerWithMostWater();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] h = {3,2,1,4,1,2};
        int[] h = {1,2,4,3};
        System.out.println(maxArea(h));
	}
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                max = Math.max(max, height[left] * (right - left));
                left++;
            }
            else {
                max = Math.max(max, height[right] * (right - left));
                right--;
            }
        }
        return max;
    }

    //misunderstanding
    //public int maxArea(int[] height) {
    //    int left = 0;
    //    int len = 0;
    //    int area = 0;
    //    for (int i = 1; i < height.length; i++) {
    //        len++;
    //        if (height[i] >= height[left]) {
    //            area += height[left] * len;
    //            left = i;
    //            len = 0;
    //        }
    //    }
    //    System.out.println(area);

    //    if (left < height.length - 1) {
    //        len = 0;
    //        int right = height.length - 1;
    //        for (int i = height.length - 2; i >= left; i--) {
    //            len++;
    //            if (height[i] >= height[right]) {
    //                area += height[right] * len;
    //                right = i;
    //                len = 0;
    //            }
    //        }
    //    }
    //    return area;
    //}
}
