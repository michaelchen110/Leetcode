import java.util.*;

public class PalindromePermutation {
	public static void main(String[] args) {
		PalindromePermutation tester = new PalindromePermutation();
		tester.unitTest();
	}
	public void unitTest() {
		String s = "";
		System.out.println(canPermutePalindrome(s));
	}
    public boolean canPermutePalindrome(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int single = 0;
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch)) map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		for (char ch : map.keySet()) {
			if (single > 1) return false;
			if (map.get(ch)%2 == 1) single++;
		}
		return single <= 1;
    }
}
