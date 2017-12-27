import java.util.*;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		LongestPalindromicSubstring tester = new LongestPalindromicSubstring();
		tester.unitTest();
	}
	public void unitTest() {
		String s = "aaabac";
		System.out.println(longestPalindrome(s));
	}
	public String longestPalindrome(String s) {
		for (int len = s.length(); len > 0; len--) {
			for (int i = 0; i < s.length()-len+1; i++) {
				if (isPalindrome(s.substring(i,i+len))) return s.substring(i,i+len);
			}
		}
		return "";
	}
	public boolean isPalindrome(String s){
		int left = 0;
		int right = s.length()-1;
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--)) return false;
		}
		return true;
	}
}
