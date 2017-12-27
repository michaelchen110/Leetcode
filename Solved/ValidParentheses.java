import java.util.*;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses tester = new ValidParentheses();
		tester.unitTest();
	}
	public void unitTest() {
		String p = "}";
		System.out.println(isValid(p));
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		String set = "{[(}])";
		for (char ch : s.toCharArray()) {
			if (set.indexOf(ch) <= 2) stack.push(ch); 
			else if (!stack.empty() && set.indexOf(stack.peek())+3 == set.indexOf(ch)) stack.pop();
			else return false;
		}
		return stack.empty();
    }
}
