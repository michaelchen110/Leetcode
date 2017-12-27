import java.util.*;

public class LetterCombinationsofaPhoneNumber {
	public static void main(String[] args) {
		LetterCombinationsofaPhoneNumber tester = new LetterCombinationsofaPhoneNumber();
		tester.unitTest();
	}
	public void unitTest() {
        List<String> letter = letterCombinations("");
        for (String str: letter) System.out.println(str);
	}
    public List<String> letterCombinations(String digits) {
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new LinkedList<>();
        if (digits.length() != 0) 
            dfs(result, new StringBuilder(), mapping, digits, 0);
        return result;
    }
    private void dfs(List<String> res, StringBuilder path, String[] map, String digits, int idx) {
        if (idx == digits.length()) res.add(path.toString());
        else {
            String ch = map[digits.charAt(idx) - '0'];
            for (int i = 0; i < ch.length(); i++) {
                dfs(res, path.append(ch.charAt(i)), map, digits, idx + 1);
                path.delete(path.length() - 1, path.length());
            }
        }
    }
}
