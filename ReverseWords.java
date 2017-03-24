import java.util.*;

public class ReverseWords{
	public static void main(String[] args) {
		/* String s = "  the !!sky is    blue  "; */
		String s = "a";
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
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
