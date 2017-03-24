import java.util.*;

public class GenerateParentheses{
	public static void main(String[] args) {
		GenerateParentheses tester = new GenerateParentheses();
		tester.unittest();
	}
	public void unittest() {
		int n = 3;
		List<String> list = generateParenthesis(n);
		System.out.println(Arrays.toString(list.toArray()));
	}
    public List<String> generateParenthesis(int n) {
        char[] p = new char[n*2];
		boolean[] used = new boolean[n*2];
		List<String> res = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			p[i] = '(';
			p[n*2-1-i] = ')';
			used[i] = false;
			used[n*2-1-i] = false;
		}
		permutation(res, sb, p, used);
		return res; 
    }
	private void permutation(List<String> result, StringBuilder path, char[] tree, boolean[] used) {
		if ((tree.length == path.length()) && isParen(path)) result.add(path.toString());
		else {
			for (int i = 0; i < tree.length; i++) {
				if (used[i] || i > 0 && tree[i] == tree[i-1] && !used[i-1]) continue;
				used[i] = true;
				path.append(tree[i]);
				permutation(result, path, tree, used);
				used[i] = false;
				path.delete(path.length()-1, path.length()); 
			}
		}
	}
	private boolean isParen(StringBuilder path) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == '(') stack.push('('); 
			else if (!stack.empty() && stack.peek() == '(') stack.pop();
			else return false;
		}
		return stack.empty();
	}
}
