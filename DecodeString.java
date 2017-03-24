import java.util.*;

public class DecodeString{
	public static void main(String[] args) {
		String s = "2[abc]3[cd]ef";
		System.out.println(decodeString(s));
	}
	public static String decodeString(String s) {
		Stack<Integer> intStack = new Stack<>();
		Stack<StringBuilder> strStack = new Stack<>();
		StringBuilder cur = new StringBuilder();
		int m = 0;
		for (char ch : s.toCharArray()) {
			if ('0' <= ch && ch <= '9') {
				m = m * 10 + ch - '0';
			}
			else if (ch == '[') {
				intStack.push(m);
				m = 0;
				strStack.push(cur);
				cur = new StringBuilder();
			}
			else if (ch == ']') {
				StringBuilder tmp = cur;
				cur = strStack.pop();
				for (m = intStack.pop(); m > 0; m--) cur.append(tmp);
			}
			else {
				cur.append(ch);
			}
		}
		return cur.toString();
    }
}
