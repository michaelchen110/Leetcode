import java.util.*;

public class ValidPalindrome {
	public static void main(String[] args) {
		ValidPalindrome tester = new ValidPalindrome();
		tester.unitTest();
	}
	public void unitTest() {
        //String s = "A man, a plan, a canal: Panama";
        String s = "0O";
        System.out.println(isPalindrome(s));
	}
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!consider(l)) left++;
            else if (!consider(r)) right--;
            else {
                if (l != r) return false;
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean consider(char ch) {
        if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z') return true;
        return false;
    }
}
