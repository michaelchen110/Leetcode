import java.util.*;

public class ReverseVowelsofaString {
	public static void main(String[] args) {
		ReverseVowelsofaString tester = new ReverseVowelsofaString();
		tester.unitTest();
	}
	public void unitTest() {
		String s = "c";
		System.out.println(reverseVowels(s));
	}
    public String reverseVowels(String s) {
		int left = 0, right = s.length()-1;
		String vowel = "aeiouAEIOU";
		char[] str = s.toCharArray();
		while(left <= right) {
			while (!vowel.contains(str[left]+"") && left < right)
				left++;
			while (!vowel.contains(str[right]+"") && left < right)
				right--;
			char tmp = str[left]; 
			str[left] = str[right];
			str[right] = tmp;
			left++; right--;
		}
		return new String(str); 
    }
}
