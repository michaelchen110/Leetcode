import java.util.*;

public class PlusOne {
	public static void main(String[] args) {
		PlusOne tester = new PlusOne();
		tester.unitTest();
	}
	public void unitTest() {
        int[] a = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));
	}
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) return digits;
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) newDigits[i + 1] = digits[i];
        newDigits[0] = 1;
        return newDigits;
    }
}
