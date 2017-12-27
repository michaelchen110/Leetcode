import java.util.*;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix tester = new LongestCommonPrefix();
		tester.unitTest();
	}
	public void unitTest() {
        //String[] strs = {"abcdd", "abdcc", "abcbd"};
        String[] strs = {};
        System.out.println(longestCommonPrefix(strs));
	}
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        int longest = 0;
        while (longest < strs[0].length() && strs[0].charAt(longest) == strs[strs.length - 1].charAt(longest)) {
            longest++;
        }
        return strs[0].substring(0, longest);
    }
}
