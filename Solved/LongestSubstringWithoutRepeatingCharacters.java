import java.util.*;

//Given "abcabcbb", the answer is "abc", which the length is 3.

//Given "bbbbb", the answer is "b", with the length of 1.

//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters tester = new LongestSubstringWithoutRepeatingCharacters();
		tester.unitTest();
	}
	public void unitTest() {
        String s = "a";
        System.out.println(lengthOfLongestSubstring(s));
	}
    public int lengthOfLongestSubstring(String s) {
        int idx = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                while (s.charAt(idx) != s.charAt(i)) {
                    set.remove(s.charAt(idx++));
                }
                idx++;
            }
            else {
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
