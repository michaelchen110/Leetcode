import java.util.*;

public class ImplementstrStr {
	public static void main(String[] args) {
		ImplementstrStr tester = new ImplementstrStr();
		tester.unitTest();
	}
	public void unitTest() {
        String S = "abcbc";
        String T = "cbc";
        System.out.println(strStr(S, T));
	}
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int idx = i;
            for (int j = 0; j < needle.length(); j++, idx++) {
                if (haystack.charAt(idx) != needle.charAt(j)) break;
            }
            if (idx - i == needle.length()) return i;
        }
        return -1;
    }
}
