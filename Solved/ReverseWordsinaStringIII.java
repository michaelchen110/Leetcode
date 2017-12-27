import java.util.*;

//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"

public class ReverseWordsinaStringIII {
	public static void main(String[] args) {
		ReverseWordsinaStringIII tester = new ReverseWordsinaStringIII();
		tester.unitTest();
	}
	public void unitTest() {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
	}
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String str: s.split(" ")) {
            for (int i = str.length() - 1; i >= 0 ; i--) {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
