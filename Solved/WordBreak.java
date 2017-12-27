import java.util.*;

//Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

//For example, given
//s = "leetcode",
//dict = ["leet", "code"].

//Return true because "leetcode" can be segmented as "leet code".

public class WordBreak {
	public static void main(String[] args) {
		WordBreak tester = new WordBreak();
		tester.unitTest();
	}
	public void unitTest() {
        String s = "leetcode";
        List<String> dict = new LinkedList<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s, dict));
	}
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
