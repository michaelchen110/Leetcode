import java.util.*;

public class MergeSortedArray {
	public static void main(String[] args) {
		MergeSortedArray tester = new MergeSortedArray();
		tester.unitTest();
	}
	public void unitTest() {
        int[] n1 = {2,5,6, 0};
        int[] n2 = {1};
        merge(n1, 3, n2, 1);
        System.out.println(Arrays.toString(n1));
	}
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        m--;
        n--;
        while (m >=0 && n >=0) {
            if (nums1[m] > nums2[n]) nums1[p--] = nums1[m--];
            else nums1[p--] = nums2[n--];
        }
        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}
