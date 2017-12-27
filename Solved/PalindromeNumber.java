import java.util.*;

public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumber tester = new PalindromeNumber();
		tester.unitTest();
	}
	public void unitTest() {
        System.out.println(isPalindrome(10));
	}
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder sb = new StringBuilder(Integer.toString(Math.abs(x)));
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left++) != sb.charAt(right--)) return false;
        }
        return true;
    }
}
