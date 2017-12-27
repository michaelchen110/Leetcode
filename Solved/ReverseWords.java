import java.util.*;

public class ReverseWords{
	public static void main(String[] args) {
         //String s = "  the !!sky is    blue  "; 
        String s = " ";
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i > 0; i--) {
            if (words[i].trim().length() == 0) continue;
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
    public static String reverseWordsBadImplement(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<StringBuilder> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch  == ' ') {
				if (sb.length() > 0) {
					stack.push(sb);
					sb = new StringBuilder();
				}
			}
			else 
				sb.append(ch);
		}
		if (sb.length() > 0) 
			stack.push(sb);
		sb = stack.empty() ? new StringBuilder() : stack.pop();
		while (!stack.empty()) {
			sb.append(' ');
			sb.append(stack.pop());
		}
		return sb.toString();
    }
}
